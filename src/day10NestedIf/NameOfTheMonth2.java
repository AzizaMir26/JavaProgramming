package day10NestedIf;

public class NameOfTheMonth2 {
    public static void main(String[] args) {



        int n = 5;

        String result = (n==1)? "January" :(n==2)? "Feb" :(n==3)? "March" :(n==4)?"April":(n==5)?"May":(n==6)?"June":(n==7)? "July":(n==8)?"August"
       :(n==9)?"Sept":(n==10)?"Oct":(n==11)?"Nov":"Dec";

        System.out.println(result);
}
}