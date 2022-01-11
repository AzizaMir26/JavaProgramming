package day12Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        System.out.println("Enter your full name ");
        String fullName = input.nextLine();      //Wooden SpoonEnter

        System.out.println("Enter Your Programming Language");
        String programmingLanguage= input.nextLine();     //Java Programming LanguageEnter

        System.out.println("enter your age:");
        int age= input.nextInt();    //24 ignores ENTER key and its left in the scanner

        input.nextLine(); // Enter will be taken by empty scanner

        System.out.println("Enter your school name");// ENTER KEY  was  assigned by default
        String school= input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        input.close();





    }
}
