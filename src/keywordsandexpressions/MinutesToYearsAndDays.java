package keywordsandexpressions;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {

//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);
        printYearsAndDays(-525600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long days = (minutes / 1440) % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
