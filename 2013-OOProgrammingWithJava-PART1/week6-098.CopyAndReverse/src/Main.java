
import java.util.Arrays;

public class Main {

    public static int[] copy(int[] array) {
        int[] arrCopy = new int[array.length];
        int element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            arrCopy[i] = element;
        }
        return arrCopy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] arrCopy = new int[array.length];
        int element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            arrCopy[array.length -1 - i] = element;
        }
        return arrCopy;
    }

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

}
