package day14String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        //domain:
        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");
        String domain= email.substring(beginningIndex,endingIndex);

        System.out.println(domain);
        System.out.println("-------------------------");

        String str1 = "Java is fun, Java is cool";

        //
        String s1 = str1.substring(0,10+1);//Java is fun
        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg);
        String s3= str1.substring(str1.indexOf(" J"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String str2= "Java is fun, Java is cool, I love Java";
        String s4= str2.substring(str2.indexOf(" I")+1);
        System.out.println(s4);

    }
}
