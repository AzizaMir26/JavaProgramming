package day15_ForLoop;


import java.util.Scanner;

public class replaceIgnoreCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = "xcodeX";

        String result = str.replace ("x","a").replace("X","a");
        System.out.println(result);
        input.close();
    }
}
/*
Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */