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
    }

    public static void printData(String header, Collection<Contact> contacts) {
//  print
        System.out.println("-".repeat(50));
        System.out.println(header);
        System.out.println("-".repeat(50));
        contacts.forEach(System.out::println);
    }
}
// done equals and hashCode