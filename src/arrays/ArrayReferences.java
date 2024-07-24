package arrays;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArrray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArrray));

        anotherArrray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArrray));
    }

    private static void modifyArray(int[] array) {

        array[1] = 2;
    }
}
