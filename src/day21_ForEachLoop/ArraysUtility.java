package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[]nums = {1,2,3,4,5};

        System.out.println(nums); // hascode error [I@3f0ee7cb

        System.out.println(Arrays.toString(nums)); // no hashcode

        System.out.println(nums[0]);

       /* String str = "Java";

        System.out.println(str);
        System.out.println(str.toString());

        */

        System.out.println("-------------------------");

        int[] scores = {95,100,55,65,85,78};

        Arrays.sort(scores); //{55.........100}
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score : "+scores[0]);
        System.out.println("Max Score: "+ scores[scores.length-1]);


        String [] names ={"Anna", "Gunay","Zuhal", "Ahmet","Maria","Sinema"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words ={"Anna", "ANNA"};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("------------------");

        int[]arr1 ={1,3,2};
        int[]arr2 ={1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2); //false

        System.out.println("-----------------------");
        // "abc", "bac"

        char[ ]  ch1 ={'a','c','b'};
        char[ ] ch2 = {'b','a','c'};

        Arrays.sort(ch1); //{a,b,c}
        Arrays.sort(ch2); //{a,b,c}











    }
}
