/*
Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */

package day08_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;

        boolean result1 = number>0;
        boolean result2 = number<0;
        boolean result3 =number==0;

        System.out.println(number +" is positive number: "+result1);
        System.out.println(number + " is negative number: "+result2);
        System.out.println(number+ " is zero: "+result3);
    }

    public static class EvenlyDivisible {
        public static void main(String[] args) {

            int number=65;
             boolean result1= number%2==0;
             boolean result2= number%3==0;
             boolean result3 = number%5==0;
            System.out.println(number + " is divisible by 2: "+ result1);
            System.out.println(number + " is divisible by 3: "+ result2);
            System.out.println(number +" is divisible by 5: "+ result3);

        }
    }
}
