package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "My favourite programming Language is Java";
        boolean hasCsharp= sentence.contains("C#");
        boolean hasJava  = sentence.contains("Java");
        boolean hasJava3 = sentence.toLowerCase().contains ("java");

        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJava3);

        System.out.println("_____________________________");

        String input1 = "I love jAvA";
        String input2 = "Java";
        System.out.println(input1.toLowerCase().contains("java"));//to check if
        // it contains and ignore case sensitivity

     String a = "Wooden Spoon";
     boolean x = a.startsWith("Woo"); //true
     boolean y= a.startsWith("oo") ; //false

        boolean z = a.toLowerCase().startsWith("wooden");//in order to ignore case sensitivity



    }
}
