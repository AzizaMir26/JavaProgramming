package day04_Variables;

public class PrimitivesIntro {
    public static void main (String[] args){

       //age;38 years old
        byte age =38;

        // weight:160 pounds
       // byte weight = 160; 160 is out of byte range

        short weight =160;// 160 is within the range of short
        //salary:100000$
       // short salary = 100000; //100000 is out of the range of short

        int salary = 100000; //preferred data type for integer numbers

        Long asset =3_333_333_333L; //you need to add L or l when type name is long primitive type

        //tax: 0.26
        float tax = 0.26F; //you can not use it, decimals can be used only with float and double.

        double PI =3.14;
//#
        char ch1='#';
        System.out.println("ch1 = " + ch1);

        char ch2=35; //based on askii table
        System.out.println("ch2 = " + ch2);


















    }

}
