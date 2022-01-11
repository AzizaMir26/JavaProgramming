package day21_ForEachLoop;

public class maximumNumber {
    public static void main(String[] args) {

        int[]numbers ={10,5,4,20,1,0};
        int max = numbers[0]; //20
        int min = numbers[0];

        for(int each : numbers ){
            if(each>max){
                max = each;
            }
        }
        for (int each1 : numbers) {
            if (each1< min){
                min= each1;
            }

        }


    }
}
