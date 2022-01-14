package day38_Inheritance.day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        if (word.charAt(0)=='x'){
          word = word.replaceFirst("x","a");//"acadex"
        }

        System.out.println(word);

    }


}
