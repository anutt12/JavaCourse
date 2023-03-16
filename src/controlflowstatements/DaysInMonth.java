package controlflowstatements;

public class DaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year >= 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            switch (month) {
                case 2:
                    return 28;
                case 4:
                case 9:
                case 6:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
}
