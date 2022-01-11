package day21_ForEachLoop;

public class initials {
    public static void main(String[] args) {

        String []names = {"Farangis Bayzaeva","Magdalena Kazimiera",
                "Kerem Ozturk" ,"Edison Kasahari","Duygu Ay"};

            for(String each: names){
                String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
                System.out.println(initial);
            }






    }
}
