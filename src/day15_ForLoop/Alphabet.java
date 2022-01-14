package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {
        //A~Z==> 65~90 in Askii table

        for(char i = 'a'; i<='z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------");
        //Z~A

        for(char i = 'Z'; i >= 'A' ; i--){
        System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_____________________-");






    }

}
/*
Print:

A~Z
a~z
Z~a
z~a

 */