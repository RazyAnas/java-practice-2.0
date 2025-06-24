package InheritanceChallenge;

import java.lang.ref.PhantomReference;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/08/2005", "18/02/2015");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        Employee ann = new Employee("Ann", "13/06/2005", "18/02/2015");
        System.out.println(ann);
        System.out.println("Age = " + ann.getAge());
        System.out.println("Pay = " + ann.collectPay());
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Anas", "11/08/2005", "12/02/2020", 500000);
        System.out.println(salariedEmployee1);
        System.out.println("Anas' Paycheck = $"+ salariedEmployee1.collectPay());
        salariedEmployee1.retire();
        System.out.println("Anas' Pension check = $" + salariedEmployee1.collectPay());
        HourlyEmployee mary = new HourlyEmployee("Mary",  "08/12/2000", "03/05/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" +  mary.getDoublePay());
    }
}

// Worker
class Worker{
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    int getAge(){
        int currentYear = 2025;
        return currentYear-Integer.parseInt(birthDate.substring(6));
    }

    double collectPay(){
        return 0.0;
    }

    void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

// Employee inherits worker as employee is a worker
class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

// SalariedEmployee inherits employee as SalariedEmployee is indeed an employee but paid
class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
//        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    double collectPay() {
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        int currentYear = 2025;
        if (currentYear <= Integer.parseInt(endDate.substring(6))){
            isRetired = true;
        }else {
            isRetired = retired;
        }
    }

    public SalariedEmployee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}

// HourlyEmployee is also an employee who works for hourly basis
class HourlyEmployee extends Employee{
    private double hourlyPayRate;
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return (2*collectPay());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}