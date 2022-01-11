package day16_ForLoopPractice;

public class reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:      0123456789


        String result = "";// to contain the reversed version of str

        //result+=str.charAt(str.length()-1); // n+

        for(int i = str.length()-1; i >=0;i--){ // i: index numbers of str(strating las index to index 0)
            result+=str.charAt(i);

        }
        System.out.println(result);








    }
}
