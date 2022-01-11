package interview_tasks;

public class DivideNumWithout {
    public static void main(String[] args) {

        int num = 30;
        int num2 = 6;
        int result = 0;

        for (int i = num2; i <=num ; i+=num2) {
            result ++;

        }
        System.out.println("result = " + result);
    }
}
/*
Write a program that can divide two numbers
without using / (division) and * (multiplication) operators
 */