package day05_Concatenation;

public class ShippingAdress1 {
    public static void main(String[] args) {

        String street = "13010 Ridgeline Blvd";
        String stateZip= "Austin,Texas,78613";
        String firstName = "Aziza";

        String lastName = "Mirzoeva";
        String fullName = firstName +" "+lastName;

        System.out.println();
        System.out.println(" "+ fullName+"\n " +street+"\n "+stateZip);

    }
}
