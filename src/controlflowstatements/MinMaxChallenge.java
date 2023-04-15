package controlflowstatements;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        try {
            while (true) {
                System.out.println("Enter a number or enter a non-integer character to exit:");
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    if (count == 0) {
                        min = input;
                        max = input;
                    } else {
                        if (input < min) {
                            min = input;
                        }
                        if (input > max) {
                            max = input;
                        }
                    }
                    count++;
                    System.out.println("Minimum: " + min);
                    System.out.println("Maximum: " + max);
                } else {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
