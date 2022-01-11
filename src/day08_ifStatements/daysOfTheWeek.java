package day08_ifStatements;

public class daysOfTheWeek {
    public static void main(String[] args) {

        int day = 1;
        boolean Monday = day == 1;
        boolean Tuesday = day == 2;
        boolean Wednesday = day == 3;
        boolean Thursday = day == 4;
        boolean Friday = day == 5;
        boolean Saturday = day == 6;
        boolean Sunday = day == 7;

        if (Monday) {

            System.out.println("Monday");
        }

        if (Tuesday) {
            System.out.println("Tuesday");
        }
        if (Wednesday) {
            System.out.println("Wednesday");
        }
        if (Thursday) {
            System.out.println("Thursday");
        }
        if (Friday) {
            System.out.println("Friday");
        }
        if (Saturday) {
            System.out.println("Saturday");
        }
        if (Sunday) {
            System.out.println("Sunday");
        }
    }
}

