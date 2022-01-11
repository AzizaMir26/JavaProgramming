package day14String;

public class methodsOfString {
    public static void main(String[] args) {

        String str1= "   batch25     ";
        str1 = str1.trim();//creates new string will not include white spaces "batch 25"
        System.out.println(str1);

        String str2= "Cydeo School";

        int n1 = str2.indexOf("h");//8
        System.out.println("n1 = " + n1);


        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);



    }
}
