package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }

    //reverses given string and returns the revered String
    public static String reverse(String str){ //Java
        String result= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }
        return result; //avaJ

    }

    // checks if the given String is Palindrome, returns boolean
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);
    }

    //check if the given String is anagram, returns boolean
    public static  boolean isAnagram(String str,String str2){ //"acb","bca"
        char[]ch1 = str.toCharArray();
        char[]ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    //remove the duplicates from the given string, returns String
    public static String removeDuplicates(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); //aaabbbbccccc
            if(!result.contains(""+ each)){
                result += each;
            }

        }
        return result;
    }



}
