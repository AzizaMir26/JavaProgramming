package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = input.nextLine();
        int length = str.length();
        String word = "Java";
        int wordLength =word.length();
        int result = 0;

        for (int i = 0; i <= length-wordLength; i++) {

            if(str.substring(i,i+4).equalsIgnoreCase(word)){
                result++;
            }


        }
        System.out.println("result = " + result);
        input.close();

    }
}
/*


write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create Java has 4 characters in total
            there for you need to check each 4 characters of the
             input one by one and see if it’s equal to java.
             (Hint:  substring( i, i+4) can get you each 4 characters string from the given string)

 */