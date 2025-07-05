package LocalAnonymousClassChallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Anas", "Razy", "22/06/2015");
        Employee e2 = new Employee("Alok", "Sharma", "28/02/2016");
        Employee e3 = new Employee("Mishba", "Pajeet", "13/01/2019");
        Employee e4 = new Employee("Sarah", "Poop", "31/05/2020");
        Employee e5 = new Employee("Saina", "cowdung", "08/03/2020");

        List<Employee> employees = new ArrayList<>(List.of(e1,e2,e3,e4,e5));

        printOrderedList(employees, "name");
        System.out.println();
        printOrderedList(employees, "years");
    }

    // method to take employee list as a parameter
    public static void printOrderedList(List<Employee> eList, String sortField) {

        int currentYear = LocalDate.now().getYear();

        // local class inside the method
        class MyEmployee{

            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(
                        containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.first(), containedEmployee.last());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(
                        fullName, yearsWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : eList) {
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {

                if (sortField.equalsIgnoreCase("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };


        list.sort(comparator);

        for (MyEmployee myEmployee : list) {
            System.out.println(myEmployee);
        }
    }

}
