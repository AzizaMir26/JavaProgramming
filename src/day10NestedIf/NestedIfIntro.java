package day10NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score =400;

        if(score>=0 && score <=100){ //if score is valid

            if ( score >=60){// if student passed
                System.out.println("Passed");
            }else{// if student failed exam
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");

        }

        System.out.println("-------------------------");

        int age = 25;
        boolean hasID = true;

        if(hasID){ //if the person has ID

            if (age >=21){ //if the person  is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ //if the person less than 21 y.o
                System.out.println("Not Eligible to buy alcohol");
            }

        }else{ // if the person doesnot have an ID
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("---------------------------");

        int number = 5;

        if (number>=0 && number<=7){

            if (number ==1){
                System.out.println("Monday");
            }else if( number==2){
                System.out.println("Tuesday");
            }else if(number==3){
                System.out.println("Wednedsday");
            }else if( number==4){
                System.out.println("Thursday");
            }else if(number== 5){
                System.out.println("Friday");
            }else if(number==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else{
            System.out.println("invalid");
        }



    }


}
