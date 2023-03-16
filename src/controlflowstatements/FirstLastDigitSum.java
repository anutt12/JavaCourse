package controlflowstatements;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int first = 0;
        int last = 0;
        int sum = 0;
        int temp = number;

        if (number < 10) {
            sum = number + number;
        } else {

            last = temp % 10;
            while (temp != 0) {
                first = temp % 10;
                temp /= 10;
            }
            sum = first + last;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
