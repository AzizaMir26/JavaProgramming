package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";
        boolean iseligible = age >=18 && citizen == "USA";

                //19>=18 && "UK" == "USA"
        // true && false
        System.out.println("iseligible = " + iseligible);

        String name2 = "Josh";
        int creditScore = 720;
        int age2 =23;
         boolean isEligible2 =creditScore >=700 && age2 >=21;

        System.out.println( name2 + " is eligible for a loan: " + isEligible2);

        System.out.println("_________________________");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >=18 && (gender=='M'|| gender == 'F');

        System.out.println("isEligible3 = " + isEligible3);
        System.out.println("______________________________-");

        String name4 = "James";
        String countryOfBirth= "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth== "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenShip: "+ isEligible4);

        System.out.println("---------------------------------------");

        String student ="Anna";
        double gpa=3.5;
        int familyIncome=100000;

        boolean isEligible5 = gpa>= 3.5 || familyIncome <= 60000;

        System.out.println(student + "is eligible for scholarship: "+ isEligible5);





    }
}
