/*        create a class named Phone Number and declare the following variables:
        countryCode, areaCode, localNumber

        use string concatenation to display the phone number

        ex:
        if  countryCode = 1
        areaCode = 703
        localNumber = 4512625

        output:
        +1(703)-4512625
        */


package day33_Statics.practice;

public class PhoneNumber {
    public static void main(String[] args) {

        int countryCode =1,
                areacode =703,
                localNumber =4512625;

        System.out.println("+" +"("+ areacode+")"+"-"+ localNumber);


    }
}
