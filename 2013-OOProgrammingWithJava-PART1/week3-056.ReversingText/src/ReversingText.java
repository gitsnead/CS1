
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        int index = text.length()-1;
        String reverseText = "";
        while (index >= 0) {
            reverseText = reverseText + text.substring(index, index + 1);
            index -= 1;
        }
        return reverseText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
