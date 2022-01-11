package day10NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n%2==0){
            System.out.println("even");//string
        }else{
            System.out.println("odd");//String
        }
        System.out.println("-----------");

        String result1= (n%2==0)?"even" : "odd";
        System.out.println(result1);

        System.out.println("-----------");
        int age = 23;
       if (age >=21){
           System.out.println("eligible");//string
       }else{
           System.out.println("not eligible");//string
       }
        System.out.println("-----------");

        String result2= (age>=21)? "Eligible": "not eligible";
        System.out.println(result2);



    }
}
