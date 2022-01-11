package day18NestedLoop;

import java.util.Scanner;

public class EligibleToBuyAlco {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        while(true){
            System.out.println("Enter your age: ");
            int age = scan.nextInt();


            while(!(age>=1  && age <=120)){ //while the age is invalid
                System.err.println("Invalid Entry, Please re-enter your age: ");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue? ");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes") || a.equals("no")) ) { //while the age is invalid
                System.err.println("Invalid Entry, Please re-enter. Would you like to conntinue? ");
                a = scan.next().toLowerCase();
            }


            if(a.equals("no")){
                break;
            }



        }
        scan.close();






    }
}
