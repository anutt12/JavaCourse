package arrays.sortedarray;

import static arrays.sortedarray.SortedArray.*;

public class Main {

    public static void main(String[] args) {

        int size = 5; // Example size
        int[] numbers = getIntegers(size); // Get user input
        int[] sortedNumbers = sortIntegers(numbers); // Sort the array
        printArray(sortedNumbers); // Print the sorted array
    }
}
