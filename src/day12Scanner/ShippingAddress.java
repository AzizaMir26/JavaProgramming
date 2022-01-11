package day12Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//enter

        System.out.println("Enter your Full name");
        String fullName = input.nextLine();// Java Programming ENTER

        System.out.println("Enter you Building Number");
        String building = input.next();//7925a

        input.nextLine();//Enter
        System.out.println("Enter your Street Name");
        String streetName = input.nextLine();//

        System.out.println("Enter your city Name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println(" Enter your zipcode");
        String zipcode= input.next();

        input.nextLine();
        System.out.println("Enter your country Name");
        String country = input.nextLine();


        System.out.println(fullName +"\n"+ building+" "+streetName+
                "\n"+cityName+", "+ state +", "+ zipcode+" "+ country);







    }
}
/*
1. Enter your Full Name(nextLine)
2. Enter Building Number(next())
3. Enter Street Name ( nextLine)
4. Enter your city name( nextLine)
5. Enter your state (next)
6. Enter your zipcode(next)
Display Shipping address

 */