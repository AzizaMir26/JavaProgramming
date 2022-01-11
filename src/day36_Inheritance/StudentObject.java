package day36_Inheritance;

import day36_Inheritance.encapsulation.Student;

public class StudentObject {
    public static void main(String[] args) {


        Student student1 = new Student("Aziza", 32, 'F', 'A', "Cydeo");
    student1.setAge(39);
        System.out.println(student1);
    }
}
