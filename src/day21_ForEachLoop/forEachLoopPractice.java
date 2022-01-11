package day21_ForEachLoop;

public class forEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String eachWord : words) {
            System.out.println(eachWord.charAt(0)+" "+eachWord.charAt(eachWord.length()-1));

        }






    }

}
