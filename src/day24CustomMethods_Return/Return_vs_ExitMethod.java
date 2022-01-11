package day24CustomMethods_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {



    }
    public static void  nameOfMonth(int number){
        if (number< 1 || number>12){
            System.out.println("Invalid");
            return; //exits namesOfMonth
        }

        String name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"March":(number==4)?"April"
                :(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August"
                :(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov" : "Dec";

        System.out.println("Month name = "+ name);
    }




}
