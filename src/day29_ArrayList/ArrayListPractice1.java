package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan","Korea","United States","Turkey","UNited Kingdom","Canada"};
        // convert Array to ArrayList:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length()>=10);
        System.out.println(list);

        //converting array list back to Array
       countries=  list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));
    }
}
/*
1Create an Array of string called countries
2write a program that can remove the country names that have lengh of ten or greater
 */