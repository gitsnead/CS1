
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int little = array[0];
        for (int i = 0; i < array.length; i++) {
            if (little > array[i]) {
                little = array[i];
            }

        }
        return little;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int start) {
        int index = start;
        for (int i = start; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int swapValue = array[index1];
        array[index1] = array[index2];
        array[index2] = swapValue;
    }
    public static void sort(int[] array) {
        for(int index = 0; index < array.length; index++) {
            swap(array, index, indexOfTheSmallestStartingFrom(array, index));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

        values = new int[]{-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

        values = new int[]{3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));

        values = new int[]{8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(values));
        sort(values);
    }

}
