package day26_CustomMethodPractice;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[]arr = {1,1,1,11,1,2,2,3,3,3,34,4,4,1,1,1,1};
       int n= frequencyOfElements(arr,1);
        System.out.println(n);



    }
    // returns the frequency of the given Element from the Array
    public static int frequencyOfElements(int[]arr,int num){

        int frequency =0;
        for (int each : arr){
            if(each == num){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                frequency++;
            }
        }

        return frequency;
    }
    
    //// returns the frequency of the given Element from the Array
    public static int frequencyOfElements(char[]arr,char ch){

        int frequency =0;
        for (char each : arr){
            if(each == ch){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                frequency++;
            }
        }

        return frequency;
    }

    // returns the frequency of the given Element from the Array
    public static int frequencyOfElements(double[]arr,double num){

        int frequency =0;
        for (double each : arr){
            if(each == num){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                frequency++;
            }
        }

        return frequency;
    }

    // returns the frequency of the given Element from the Array
    public static int frequencyOfElements(String[]arr,String s){

        int frequency =0;
        for (String each : arr){
            if(each.equals(s) ){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                frequency++;
            }
        }

        return frequency;
    }

}

/*
1.1 Create a method that passes two parameters: an integer array and an Integer element.
The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element.
            The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element.
             The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element.
            The method returns the frequency of the given String element from the String array
 */
