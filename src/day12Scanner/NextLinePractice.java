package day12Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter the Full Name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();

        input.nextLine();
        System.out.println("Enter schhol name");
         String schoolName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


        input.close();
    }
}
/*
1A.sk user to enter age(nextInt))

2.Full Name (NextLine)
 */