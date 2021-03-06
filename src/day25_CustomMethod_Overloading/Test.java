package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {


    public static void main(String[] args) {
        String str= "Java Programming language";

        StringUtility.printEachChar(str);
        System.out.println("------------");

        String s1="Wooden spoon";
        String result = StringUtility.reverse(s1);
        System.out.println(result);

        System.out.println("---------------");

        String word ="civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println("---------------");

        String[]names = {"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count = 0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println("String has "+count+" palindromes");

        System.out.println("---------------------");

        String s2 = "aaaabbbbcccdddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);

    }
}
