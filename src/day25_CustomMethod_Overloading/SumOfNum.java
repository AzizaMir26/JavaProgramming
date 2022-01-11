package day25_CustomMethod_Overloading;

public class SumOfNum {
    public static void main(String[] args) {
        int sumoOf2 = sumOf2Num(10, 20);
        System.out.println("sumoOf2 = " + sumoOf2);

        int sumOf3 = sumOf3Num(10, 20, 30);
        System.out.println("sumOf3 = " + sumOf3);

        int sumOf4= sumOf4Num(10,20,30,40);
        System.out.println("sumOf4 = " + sumOf4);
    }

    public static int sumOf2Num(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Num(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sumOf4Num(int num1, int num2, int num3,int num4) {
        return num1 + num2 + num3+num4;
    }
}



/*
1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */