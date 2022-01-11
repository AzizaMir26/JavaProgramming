package day19_LoopPractices;

import javax.lang.model.SourceVersion;

public class Unique_withoutindexOf {
    public static void main(String[] args) {
       String str = "aabccdeef";
       String result=" "; //unique characters


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);// 'A'
            int count=0;// represents the frequency of the variable


            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string whenever is matvhed will increase count by 1;
                char each= str.charAt(i); //each character of str
                if (ch == each) {
                    count++;
                }

            }
            if(count==1){ //if the frequency of the character is 1, then the character is unique
                result+= ch;

            }
        }
        System.out.println("result = " + result);







    }


}
/*
Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
             then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique



 */