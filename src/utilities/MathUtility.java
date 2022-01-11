package utilities;

public class MathUtility {

    //return the sum of two integers
    public static int  sumOfNum(int n1,int n2){
        int result = n1+n2;
        return result;
    }

    //return the sum of two decimal numbers
    public static double sumOfNum(double n1,double n2){
        double result = n1+n2;
        return result;
    }

    //return the subtraction of two integers
    public static int  subtraction(int n1,int n2){
        int result = n1-n2;
        return result;
    }

    //return the subtraction of two decimals
    public static double subtraction(double n1,double n2){
        double result = n1-n2;
        return result;
    }

    //return the multiplication of two integers
    public static int  multiplication(int n1,int n2){
        int result = n1*n2;
        return result;
    }

    //return the multiplication of two decimals
    public static double multiplication(double n1,double n2){
        double result = n1*n2;
        return result;
    }

    //return the division of two decimals
    public static double division (double n1,double n2){
        double result = n1/n2;
        return result;
    }

    //check if an integer is even number
    public static boolean  isEvenNumber(int num){
        boolean isEven=false;
        if(num%2==0){
           isEven= true;
        }
        return isEven;
    }

    //check if an integer is odd number
    public static boolean  isOddNumber(int num){
        boolean isOdd=false;
        if(num%2!=0){
            isOdd= true;
        }
        return isOdd;
    }

    //return the maximum number between two integers
    public static int maxNum(int num1,int num2){
       int result=0;
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }

   //return the maximum number between two decimals
    public static double maxNum(double num1,double num2){
        double result=0;
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }

    //return the minimum number between two integers
    public static int minNum(int num1,int num2){
        int result =0;
        if(num1<num2){
            result=num1;
        }else{
            result=num2;
        }
        return result;
    }

    //return the minimum number between two decimals
    public static double minNum(double num1,double num2){
        double result =0;
        if(num1<num2){
            result=num1;
        }else{
            result=num2;
        }
        return result;
    }

    //return the square of an integer
    public static int square(int num1){
        int result = num1*num1;
        return result;
    }

    //return the square of double
    public static double square(double num1){
        double result = num1*num1;
        return result;
    }

    //return the cube of an integer
    public static int cube(int num1){
        return num1*num1*num1;
    }

    //return the cube of double
    public static double cube(double num1){
        return num1*num1*num1;
    }


}
