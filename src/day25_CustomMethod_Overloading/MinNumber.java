package day25_CustomMethod_Overloading;

public class MinNumber {
    public static void main(String[] args) {
        int[]arrI= {1,5,7,4,3,8};
       int minI= MinNumber(arrI);
        System.out.println(minI);
        System.out.println("----------------");

        double[]arrd ={1.2,4.5,6.3,2.3,4.5};
        double minD= MinNumber(arrd);
        System.out.println(minD);
        System.out.println("------------------");

        long [] arrL={150l,239l,345l,345678l};
       long minL = MinNumber(arrL);
        System.out.println(minL);
        System.out.println("--------------");

        short[]arrS = {234,456,765,123,345};
        short minS =MinNumber(arrS);
        System.out.println(minS);
        System.out.println("--------------");

        float[] arrF={123f,321f,464f,345f,123f};
        float minF =MinNumber(arrF);
        System.out.println(minF);
        System.out.println("------------");

        byte[] arrB= {100,56,43,23,67,89};

        byte minB =MinNumber(arrB);
        System.out.println(minB);
        System.out.println("-------------");
    }

    public static int MinNumber (int[]array){
    int min = array[0];
        for (int each : array) {
        if (each < min) {
            min = each;
        }
    }
        return min;
}

    public static double MinNumber (double[]array){
        double min = array[0];
        for (double each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static long MinNumber (long[]array){
        long min = array[0];
        for (long each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static short MinNumber (short[]array){
        short min = array[0];
        for (short each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static float MinNumber (float[]array){
        float min = array[0];
        for (float each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static byte MinNumber (byte[]array){
        byte min = array[0];
        for (byte each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
/*
create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array

 */