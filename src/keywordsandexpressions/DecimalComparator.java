package keywordsandexpressions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        a = a * 1000;
        b = b * 1000;

        int a1 = (int) a;
        int b1 = (int) b;

        return a1 == b1;
    }
}
