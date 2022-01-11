package day25_CustomMethod_Overloading;

public class Reverse {


    public static int[] Reverse (int[]array){



        int[]reversed = new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=array[i];

        }
        return reversed;
    }

}
/*
1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */
