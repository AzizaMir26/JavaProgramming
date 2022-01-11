package day05_Concatenation;

import javax.lang.model.SourceVersion;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Aziza";
        String lastName = "Mirzoeva";
        String fullName = firstName +" "+lastName;
        int age =45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100_000.58;
        String street = "7925 Ranch DR";
        String stateZip= "Mclean,VA,78465";


        System.out.println("Full name of the person is "+ fullName);

        //_____ is ____ years old
        System.out.println(fullName+ " is "+age +" years old.");
        //Fullname is Jobtitle, works at CompanyName

        System.out.println(fullName+ " is "+jobTitle +" at "+ companyName+"with the "+salary+".");

        /*Jimmy Joe
        7925 Ranch Dr
        McLean,VA,78645
         */
        System.out.println();
        System.out.println(" "+ fullName+"\n " +street+"\n "+stateZip);



    }
}
