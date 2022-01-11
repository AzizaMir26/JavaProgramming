package day09_IfStatements;

public class EligibleToBuyAlco {
    public static void main(String[] args) {


        int age = 22;

        boolean Eligible = age >= 21;

        if (Eligible) {
            System.out.println(" Eligible to buy alcohol");
        } else {

            System.out.println(" Not Eligible to buy alcohol");
        }
    }

}