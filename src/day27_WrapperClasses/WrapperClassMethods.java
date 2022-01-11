package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {


        String str ="123";

       int num= Integer.parseInt(str);//int

        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";
        double num2 =Double.parseDouble(str2);//double
        System.out.println(num2 + 1); //11.5

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        String s1 ="maybe";
        boolean r1 =Boolean.parseBoolean(s1);
        System.out.println(r1);//false
        System.out.println("----------------------------");

        String s2 = "123";
        Integer x= Integer.valueOf(s2);//Integer
        int y =Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3 = "1,5";
        Double z =Double.valueOf(s3);
        System.out.println(z);

        System.out.println("-----------------------------------");

        //isDigit()
        char ch1='0';

        boolean r2= Character.isDigit(ch1);
        System.out.println(r2);

        boolean r3 = Character.isLetter(ch1);

      boolean r5 = !Character.isLetterOrDigit(ch1); //not letter or digit//special character

        Character.isUpperCase(ch1); //Uppercase
        Character.isLowerCase(ch1);//lowercase

        System.out.println("-------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+ each);
            }

        }
        System.out.println("sum = " + sum);



    }
}
