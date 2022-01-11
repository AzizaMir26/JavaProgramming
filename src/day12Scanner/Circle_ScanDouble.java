package day12Scanner;

import java.util.Scanner;

public class Circle_ScanDouble {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");

        double r = scan.nextDouble(); //ask customer put double number

        double area =r* r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();





    }
}
/*
Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */
