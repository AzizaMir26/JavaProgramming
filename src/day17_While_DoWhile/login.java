package day17_While_DoWhile;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = input.next();
        System.out.println(" Enter a password: ");
        String password = input.next();

        //username: " Cydeo"
        //password: " Cydeo123"
        int attempt = 3;

        if(username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Successfully logged in!");
        }
        while( !(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt>0){
            System.out.println("Password incorrect. Please try again.");
            System.out.println("Enter a username: ");
             username = input.next();

            System.out.println(" Enter a password: ");
            password = input.next();
            attempt-=1;
        }
        if (attempt<=0){
            System.out.println(" You have exceeded number of attempts. Please contact customer service.");
        }





    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                 the program should allow the user to have three attempts
                  to enter correct credentials and if all three attempts are failed, then print
                  "Your account is lucked."
 */