package day10NestedIf;

public class NameOftheMonth {


    public static void main(String[] args) {
        int number=15;
        String result="";//temprorary new words would be assigned below

        if (number >=1 && number<=12){  //if the number is valid

            if (number ==1){
                result = "January";
            }else if (number==2){
                result="February";
            }

        }else{      //if the number is not valid
            System.out.println("invalid number");
    }
        System.out.println(result);
}
}