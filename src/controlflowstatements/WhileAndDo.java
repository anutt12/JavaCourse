package controlflowstatements;

public class WhileAndDo {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
////        count = 1;
////        while (true) {
////            if (count == 6) {
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        /*
         * Create a method called isEvenNumber that takes a parameter of type int
         * Its purpose is to determine if the argument passed to the method is
         * an even number or not.
         * return tru if an even number, otherwise return false
         * */

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            } else if (isEvenNumber(number)) {
                count++;
                System.out.println("Even number " + number);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Total count of even numbers = " + count);
        /*
         * Modify the while code above
         * Make it also record the total number of even numbers it has found
         * and break once 5 are found
         * and at the end, display the total number of even numbers found
         * */

    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
