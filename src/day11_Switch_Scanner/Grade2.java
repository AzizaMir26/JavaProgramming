package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case'A':
            case'B':
            case'C':
            case'D':
            default:
                System.out.println("Failed");

        }




    }
}
/*
if the grade is A or B or C or D======> "Passed"
otherwise "failed"
 */