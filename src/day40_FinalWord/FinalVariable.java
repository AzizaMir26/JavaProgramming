package day40_FinalWord;

public class FinalVariable {

    final String birthday;//when u create an object you can set it one time and its unchangeable after word final

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

      final  double pi = 3.14;

        //pi=4.14;final variable can not be reassigned

        final String name;
        name ="Java";
       //  name ="Wooden Spoon";

        System.out.println(name);

        System.out.println("-----------------------------");

        FinalVariable obj = new FinalVariable("May/01");


    }
}
