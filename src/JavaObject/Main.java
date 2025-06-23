package JavaObject;

public class Main extends java.lang.Object{
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolStudent paglu = new PrimarySchoolStudent("Paglu Khan", 10, "Paglu ka baap maha paglu");
        System.out.println(paglu.toString());
    }
}
class Student{
    private  String name;
    private  int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return  name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + " ka beta, " + super.toString();
    }
}