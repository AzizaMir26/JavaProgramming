package day28_Array_List;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        //int num =1;
        //list.remove(num); //will remove 200 at the index1
        Integer num = 200; // as a object Non- primitive Wrapper class because uppercase
        boolean r = list.remove(num); // if successfully removed true if not false, if numbers doesnt exist it wil return false
        System.out.println(list);
        // list.remove(200) 200 will be accepted as int index number;
        System.out.println(r);
        System.out.println("------------------------------");

        list.clear(); // array list is empty after that, size is 0;

        System.out.println(list.size());

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');


       int a= characters.indexOf('A'); //0
       int b= characters.lastIndexOf('A');//4

        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------------");

        boolean r2 = characters.contains('A');
       boolean r3 = characters.contains('Z');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        System.out.println(list1.equals(list2));

    }
}
