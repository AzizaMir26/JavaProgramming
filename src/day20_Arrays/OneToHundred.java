package day20_Arrays;

import java.util.Arrays;

public class OneToHundred {
    public static void main(String[] args) {

int[]numbers = new int[100];

        for (int i = 1;i<=numbers.length; i++) {
            numbers[i-1] = i;


        } System.out.println(Arrays.toString(numbers));

    }
}
/*
1. create an array that has the numbers 1 to 100
 */