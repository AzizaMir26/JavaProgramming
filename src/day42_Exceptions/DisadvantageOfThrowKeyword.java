package day42_Exceptions;

public class DisadvantageOfThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Hello");
        //sleep(2.5);//method below used throws, which is temporarily and gives error anyway
        System.out.println("Hello world");
        System.out.println("------------------");
        System.out.println("Hello");
        MorningWorkout.sleep(2.5);//try & catch
        System.out.println("Cydeo");

    }
    public static void sleep(double second) throws InterruptedException {
        Thread.sleep((long)(second*1000));
    }
}
