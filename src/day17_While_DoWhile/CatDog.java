package day17_While_DoWhile;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = input.nextLine();
        String cat = "cat";
        String dog = "dog";
        int catLength  = cat.length();
        int dogLength= dog.length();
        int strLength = str.length();
        int result1=0;
        int result2 = 0;


        for (int i = 0; i <= strLength-3; i++) {
            if (str.substring(i, i+catLength).equalsIgnoreCase("cat")){
                result1++;
            }
            if (str.substring(i, i+dogLength).equalsIgnoreCase("dog")) {
                result2++;
            }
        }boolean resultofwords = result1==result2;
        System.out.println(resultofwords);
    }
}
/*
 write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */