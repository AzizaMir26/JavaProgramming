package day24CustomMethods_Return;

import java.util.Locale;

public class Breakfasts {
    public static void main(String[] args) {

        initials("Aziza","Mirzoeva");
        domain("azuzya27@gmail.com");
        nameOfMonth(5);







    }


    //create a method that can display the initials of the person.
    public static void initials(String firstName,String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //create a method that can display the domain of the email. domain(String email)
    public static void domain(String email){ //Cydeo@gmail.com

        String domain  = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    // Create a method that can display the name of the month based on the given number to the method
    public static void  nameOfMonth(int number){
        String name="";
        if(number>=1 && number<=12){
            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"March":(number==4)?"April"
                    :(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                    :(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov" : "Dec";
        }else{
            name ="Invalid";
        }
        System.out.println(name);
    }




}
