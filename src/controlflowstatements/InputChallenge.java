package controlflowstatements;

import java.util.Scanner;

public class InputChallenge {

    public static void main(String[] args) {

        System.out.println(getData());

        // Instructor solution

//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 1;
//        int sum = 0;
//
//        while (counter <= 5) {
//            System.out.println("Enter number #" + counter + ":");
//            String nextNumber = scanner.nextLine();
//            try {
//                int number = Integer.parseInt(nextNumber);
//                counter++;
//                sum += number;
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid number");
//            }
//        }
//
//        System.out.println("The sum of the 5 numbers = " + sum);
//    }

}

    // My solution
    public static String getData() {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 5) {
            System.out.println("Enter number #" + count + ":");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                sum += value;
                count++;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        return String.valueOf(sum);

    }
}
