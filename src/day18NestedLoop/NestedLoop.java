package day18NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }

        System.out.println("----------------------------------");
        for (int j = 0; j <4 ; j++) { //j:0,1,2,3.
            for (int i = 0; i < 5; i++) { //i:0,1,2,3,4
                System.out.println("wooden spoon");
            }


        }



    }
}
