package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[]array = {1,2,3};
        int[] arr2 = {4,5,6};
        array=mergedArray(array,arr2);
        System.out.println("Merged Array = " + Arrays.toString(array));
        System.out.println("-----------------------");
        double[]arr1 = {1.5,2.5,3.5,4.5};
        double[] arr3 ={5.5,6.5,7.5};
       arr1= mergedArray(arr1,arr3);
        System.out.println("Merged Array = " + Arrays.toString(arr1));
        System.out.println("-----------------------");
        char[] arrCh ={'A','B','C','D'};
        char[]arrCh2 ={'E','F','G'};
        arrCh=mergedArray(arrCh,arrCh2);
        System.out.println("Merged Array= " + Arrays.toString(arrCh));
        System.out.println("--------------------");
        String [] arrStr = {"Aziza","Ashraf","Ghani"};
        String [] arrStr1 ={"Rano","Munira","Fara"};
        arrStr=mergedArray(arrStr,arrStr1);
        System.out.println("Merged array= " + Arrays.toString(arrStr));




    }

    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length, k = 0; j < (arr1.length + arr2.length); j++, k++) {
            arr3[j] = arr2[k];

        }
        return arr3;
    }

    public static double[] mergedArray(double[] arr1, double[] arr2) {
        double[] arr3 = new double[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length, k = 0; j < (arr1.length + arr2.length); j++, k++) {
            arr3[j] = arr2[k];

        }
        return arr3;
    }

    public static char []mergedArray(char[] arr1,char[]arr2) {
        char[] arr3 = new char[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length, k = 0; j < (arr1.length + arr2.length); j++, k++) {
            arr3[j] = arr2[k];

        }
        return arr3;
    }

    public static String []mergedArray(String[] arr1,String[]arr2) {
        String[] arr3 = new String[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length, k = 0; j < (arr1.length + arr2.length); j++, k++) {
            arr3[j] = arr2[k];

        }
        return arr3;
    }
}
/*
 create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
    
 */