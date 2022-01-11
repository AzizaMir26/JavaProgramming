package day08_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
       /* System.out.println( true ==!false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true);//true

        System.out.println(!!false);//false
        System.out.println(!!!true);//false

        */

      /*  90~100 ==> Excellent;
        80 ~89 ==> Great;
        70~79 ==> Good;
        60~69 ==> Passed

       */
           int score = 85;
           boolean a = score>= 90 && score <= 100;
           boolean b = score>= 80 && score <= 89;
           boolean c = score>= 70 && score <= 79;
           boolean d = score >= 60 && !a && !b && !c;


           if (a){
               System.out.println("Excellent");
           }
           if (b) {
               System.out.println("Great");

           }
           if (c){
               System.out.println("Good");
           }
           if (d){
               System.out.println("Passed");
           }










    }
}
