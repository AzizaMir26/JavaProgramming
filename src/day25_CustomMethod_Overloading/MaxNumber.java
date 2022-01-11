package day25_CustomMethod_Overloading;

public class MaxNumber {
    public static void main(String[] args) {

        int[]arr1 = {1,2,4,3,6,8,10};
       int maxNum = maxNumber(arr1);
        System.out.println("Maximum Integer NUmber: "+ maxNum);
        System.out.println("--------------");

        double[]arrd ={1.2,4.5,6.3,2.3,4.5};
        double maxNumD = maxNumber(arrd);
        System.out.println("Maximum Double NUmber:"+maxNumD);
        System.out.println("--------------");

        long [] arrL={150l,239l,345l,345678l};
        long maxNumL =maxNumber(arrL);
        System.out.println("Maximum Long Number: "+maxNumL);
        System.out.println("----------------");

        short[]arrS = {234,456,765,123,345};
        short maxNumS = maxNumber(arrS);
        System.out.println("Maximum short number: "+maxNumS);
        System.out.println("-------------------");

        float[] arrF={123f,321f,464f,345f,123f};
       float maxNumF= maxNumber(arrF);
        System.out.println("Maximum Float Number: "+maxNumF);
        System.out.println("-----------------");

        byte[] arrB= {100,56,43,23,67,89};
        byte MaxNumB= maxNumber(arrB);
        System.out.println("Maximum Byte Number: "+ MaxNumB);

    }
    
    
    
    
    public static int maxNumber (int[]array) {

        int max = 0;
        for (int each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static double maxNumber (double[]array) {

        double max = 0;
        for (double each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static long maxNumber (long[]array) {

        long max = 0;
        for (long each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static short maxNumber (short[]array) {

        short max = 0;
        for (short each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static float maxNumber (float[]array) {

        float max = 0;
        for (float each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static byte maxNumber (byte[]array) {

        byte max = 0;
        for (byte each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
/*
 1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array

 */