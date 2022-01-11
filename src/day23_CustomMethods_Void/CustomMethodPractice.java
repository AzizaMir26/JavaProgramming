package day23_CustomMethods_Void;

public class CustomMethodPractice {
    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();


    }

    //create a function that can print Hello world 5 times ===> helloWorld5Times()
    public static void helloWorld5Times(){
        for(int i = 0;i<5;i++){
            System.out.println("Hello World!");
        }

    }

    // create a function that can print Hello Cydeo 5 times ===> helloCydeo5Times()
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }

    }


}
