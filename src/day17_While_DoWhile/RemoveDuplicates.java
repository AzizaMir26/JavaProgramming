package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = " ";//ABC

        for (int i = 0; i < str.length(); i++) {
            String ch =""+ str.charAt(i); // each character of the string as a string type
            if (result.contains(ch)){
                continue; //skips duplicates
            }
            result+=ch;
        }
        System.out.println(result);


    }
}
