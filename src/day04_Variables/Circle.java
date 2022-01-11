/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
 */
package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double PI =3.14;
                int radius =15;
                double area =PI * radius;
                double perimeter= 2*PI*radius;
        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);;


    }
}
