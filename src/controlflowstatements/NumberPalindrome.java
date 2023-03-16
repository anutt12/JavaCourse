package controlflowstatements;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = Math.abs(number);

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        if (number < 0) {
            reverse = -reverse;
        }

        return number == reverse;
    }


}
