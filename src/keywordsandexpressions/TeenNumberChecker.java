package keywordsandexpressions;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c) {

        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) return true;
        else return c >= 13 && c <= 19;
    }

    public static boolean isTeen(int d) {

        return d >= 13 && d <= 19;
    }
}
