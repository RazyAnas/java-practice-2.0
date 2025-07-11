package NestedClasses;

import NestedClasses.domain.Employee;
import NestedClasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee
                .EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg",
                        2019, "Target"),
                new StoreEmployee(10515, "Joe",
                        2019, "Walmart"),
                new StoreEmployee(10105, "Tom",
                        2020, "Macys"),
                new StoreEmployee(10215, "Marty",
                        2018, "Walmart"),
                new StoreEmployee(10322, "Bud",
                        2016, "Target")
        ));

//        var comparator = new Employee.EmployeeComparator<>();

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }

        System.out.println("With Pig Latin Names");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<? extends StoreEmployee> list) { //  input is a list of StoreEmployee or any class that is a subclass of StoreEmployee

        String lastName = "Piggy";
        // Inner class unlike nested class is defined when making a local class inside a method
        // inner class requires fields to be final or effectively final!
        class DecoratedEmployee extends StoreEmployee
                implements Comparable<DecoratedEmployee>{

            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName; // return store employee toString representation
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

        newList.sort(null); // if we use null in sort it will be the same compareTo method with naturalOrder()
        for (var dEmployee : newList) {
            System.out.println(dEmployee.originalInstance.getName() + " "
                    + dEmployee.pigLatinName);
        }


    }
}
