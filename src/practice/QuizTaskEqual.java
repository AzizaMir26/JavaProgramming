package practice;
import java.sql.SQLOutput;
import java.util.*;
public class QuizTaskEqual {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );

            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();
            String result="";
            //your code here
            String a1= "b";
            String a2= "c";
            String a3= "a";

            if(a.equals(a1) || a.equals(a2) || a.equals(a3)){
                if(a.equals(a3)){
                    System.out.println(a3+ " is wrong");
                }else if(a.equals(a1)){
                    System.out.println(a1+" is correct");
                }else{
                    System.out.println(a2+" is wrong");
                }
            }else{
                System.out.println(a+" is not a valid answer");;
            }
        }
}