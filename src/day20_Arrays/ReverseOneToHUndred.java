package day20_Arrays;

import java.util.Arrays;

public class ReverseOneToHUndred {
    public static void main(String[] args) {

        int[]numbers = new int[100];

        for (int i = numbers.length;  i >= 1;i--) {
            numbers[numbers.length-i] = i;


        } System.out.println(Arrays.toString(numbers));


    }
}
/*
2. create an array that has the numbers 100 to 1
 */