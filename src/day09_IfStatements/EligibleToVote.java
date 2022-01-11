package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
         String name =  " Josh";
         int age = 30;
         String citizen = " USA";

         boolean eligibleToVote= (age>=18 && citizen ==" USA");

         if (eligibleToVote){
             System.out.println(name + " is eligible to vote ");
         }else{
             System.out.println( name + " is NOT eligible to vote");
         }
    }
}
