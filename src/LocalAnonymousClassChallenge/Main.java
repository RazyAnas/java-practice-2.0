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

        takesEmployeeList(employees);


    }

    // method to take employee list as a parameter
    public static void takesEmployeeList(List<Employee> employees) {

        // local class inside the method
        class LocalClass{
            private String fullName;
            private int yearsWorked;
            private static List<EmployeeInfo> employeeInfoList = new ArrayList<>();

            public LocalClass(String fullName, int yearsWorked) {
                this.fullName = fullName;
                this.yearsWorked = yearsWorked;

                employeeInfoList.add(new EmployeeInfo(fullName, yearsWorked));
            }

            public static List<EmployeeInfo> getList() {
                return employeeInfoList;
            }

        }

        for (var employee : employees) {
            String firstName = employee.firstName();
            String lastName = employee.lastName();
            String fullName = firstName + " " + lastName;

            String[] parts = employee.hireDate().split("/");
            int yearStarted = Integer.parseInt(parts[2]);
            int currentYear = LocalDate.now().getYear();
            int yearsWorked = currentYear - yearStarted;

            new LocalClass(fullName, yearsWorked);
        }

        var c0 = new Comparator<EmployeeInfo>() {
            @Override
            public int compare(EmployeeInfo o1, EmployeeInfo o2) {
                return o1.fullName().compareTo(o2.fullName());
            }
        };

        List<EmployeeInfo> list = LocalClass.getList();
        list.sort(c0);
        for (EmployeeInfo info : list) {
            System.out.println(info.fullName() + ": " + info.yearsWorked());
        }


    }

}
