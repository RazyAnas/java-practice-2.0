package SetsAndMaps;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Contact> emails = ContactData.getData("email"); // List --> obviously will contain duplicates
        List<Contact> phones =  ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails); // Set --> but contains duplicate
        // duplicates are determined first by hashcode and then equals()
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Gay");
        robinHood.addEmail("Gay");
        robinHood.replaceEmailIfExists("RHood@gay.com", "RHood@straightandnormal.com"); // gays are weird lets make them normal!
        System.out.println(robinHood);

        // union
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A) ∪ B) Union of emails (A) with phones (B)", unionAB);

        // intersection
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts); // keep only common data, but retains data of phone
        printData("(A ∩ B) Intersect emails (A) and phones (B)",
                intersectAB);

        // intersection
        Set<Contact> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts); // keep only common data, but retains data of email
        printData("(B ∩ A) Intersect phones (B) and emails (A)",
                intersectBA);

        // Minus
        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts); // keep only uncommon data
        printData("(A - B) emails (A) minus phones (B)",
                AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts); // keep only uncommon data
        printData("(B - A) phones (B) minus emails (A)",
                BMinusA);

        // symmetric difference
        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric Difference: phones and emails", symmetricDiff);

        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectAB);
        printData("Symmetric Difference: phones and emails", symmetricDiff2);
    }

    public static void printData(String header, Collection<Contact> contacts) {
//  print
        System.out.println("-".repeat(50));
        System.out.println(header);
        System.out.println("-".repeat(50));
        contacts.forEach(System.out::println);
    }
}