package day07_Operators;

import javax.swing.*;

public class ShorthandOperators {
    public static void main(String[] args) {

        //assignement:=
        int number =100;

        System.out.println("number = " + number);//100

        number=200;
        System.out.println("number = " + number);//200

        String word= "Java Programming";

        System.out.println("word = " + word);//Java Programming

        word= "Wooden Spoon";

        System.out.println("word = " + word);

        //word=123; can not be reassigned to int because initially it was string

        System.out.println("--------------------------");
        //Addition Assignment:

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200);// 300 but x still 100
        x+=200;
        System.out.println("x = " + x);

        String str=" Wooden";
        str+=" Spoon";

        System.out.println("str = " + str);

        System.out.println("-----------");

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5
        num1+=5.5;


        System.out.println("num1 = " + num1);//8.0

        System.out.println("-------------");

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance +=300;

        System.out.println("availableBalance = " + availableBalance);//1300.5

        System.out.println("________________");

        //withdrawing 500$

        availableBalance-=500;

        System.out.println("availableBalance = " + availableBalance);
        availableBalance-=200;
        availableBalance+=400;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------");

        double salary=50000.5;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);

        System.out.println("_________________");


        double num3 =100;

        //%=

        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("--------------");

        int amount = 127; //cents
         int quarters =amount/25;
         int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------");
        int cents2=127;

        cents2%=25;
        System.out.println("cents2 = " + cents2);

        int y =300;
        y %=16;
        System.out.println("y = " + y);

        System.out.println("----------------");

        int balance=3500;

        //insurance fee:$153

        balance%=153;
        System.out.println("balance = " + balance);













    }

}
