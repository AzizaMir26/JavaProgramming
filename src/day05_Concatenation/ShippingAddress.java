/*
        Create a class called ShippingAddress.java
        Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode

        Use concatenation to print the full shipping address
package day05_Concatenation;

 */

public class ShippingAddress {
    public static void main(String[] args) {
        String street = "7925 Ranch DR";
        String stateZip= "Mclean,VA,78465";
        String firstName = "Aziza";

        String lastName = "Mirzoeva";
        String fullName = firstName +" "+lastName;

        System.out.println();
        System.out.println(" "+ fullName+"\n " +street+"\n "+stateZip);
    }
}
