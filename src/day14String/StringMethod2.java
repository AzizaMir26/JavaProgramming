package day14String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str= "Java is fun, I love learning Java";
       String str2=  str.replace("Java","Python");//Python is fun, i love learning Python;
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email= "johnSmith@yahoo.com";
        email =email.replace("yahoo","gmail");
        System.out.println("email = " + email);

        String sentence= "Java Java Python Python C# C# C++ C++ Python Python Python";
        String sentence2 = sentence.replace("Python","")
                .replace("   "," ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String result ="Java Java Java";
        result=result.replaceFirst("Java", "Python");

        System.out.println(result);
        System.out.println("--------------");

        String result2="C# is fun, C#is cool";
        result2= result2.replaceFirst("C#","Java");
        System.out.println(result2);

        System.out.println("____________");

        String result3= "Java";
        result3= result3.replaceFirst("a","b");
        System.out.println(result3);

        result3= result3.replaceFirst("va","vo");
        System.out.println(result3);


    }
}

