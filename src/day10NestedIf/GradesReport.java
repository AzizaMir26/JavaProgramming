package day10NestedIf;

public class GradesReport {
    public static void main(String[] args) {


        int score=95;
        if (score>=0 && score <=100){ // if the score is valid
            //5 possibilities
            if (score>=90 ){
                System.out.println("Excellent");
            }else if (score >=80 ){
                System.out.println("Great");
            }else if (score>=70){
                System.out.println("Good");
            }else if ( score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

            }else{
            System.out.println("Invalid Score");
        }

            System.out.println("-----------------------");

            String result="";//temporary

        System.out.println(result );
    }


}
