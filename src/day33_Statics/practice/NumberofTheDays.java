package day33_Statics.practice;

public class NumberofTheDays {
    public static void main(String[] args) {
         int month = 5;

         if(month==1 || month==3 || month ==5 || month==7 || month==8 ||month ==10 ||month ==12){
             System.out.println("31");
         }else if (month ==4 || month==6 || month==9 ||month ==11){
             System.out.println("30");
         }else{
             System.out.println("28");
         }
    }
}
/*
Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */