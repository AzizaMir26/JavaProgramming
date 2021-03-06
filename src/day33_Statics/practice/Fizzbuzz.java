package day33_Statics.practice;

public class Fizzbuzz {
    public static void main(String[] args) {
        int num = 15;

        if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
    }
}




/*
Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz
 */