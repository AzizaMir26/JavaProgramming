package day11_Switch_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=2;

        switch (gradeLevel) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary school");
                break;

            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;

            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;

            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;

            case 17: case 18:
                System.out.println("Grad School");
                break;

            default:
                System.out.println("Invalid Grade Level Given");
                break;

        }
        //Solution
        if (gradeLevel>=1 && gradeLevel<=18){
            switch (gradeLevel) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Elementary school");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println("Middle School");
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("High School");
                    break;

                case 13:
                case 14:
                case 15:
                case 16:
                    System.out.println("College");
                    break;

                case 17:
                case 18:
                    System.out.println("Grad School");
                    break;

                default:
                    System.out.println("Invalid Grade Level Given");
                    break;
            }

        }else{
            System.out.println("Invalid Grade Level");
        }
    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both
 */