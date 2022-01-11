package day16_ForLoopPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Level";
        String reversed = "";


        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+= word.charAt(i);

        }
        boolean isPalidrome= reversed.equalsIgnoreCase(word);
        System.out.println(isPalidrome);
    }
}
/*
"Java"===>false (not palindrome)
"Anna" ==> "annA===> true

 */