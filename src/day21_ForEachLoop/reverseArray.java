package day21_ForEachLoop;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
        int[]reversed = new int[numbers.length];//to make sure that the Array has enough capacity to contain all the elements of the first Array
       /*
        reversed[0]=numbers[numbers.length-1];
        reversed[1] =numbers[2];

        */
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];

        }


        System.out.println(Arrays.toString(reversed));

    }
}
