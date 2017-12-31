import java.util.Scanner;

public class Palindromi {

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
        
    public static boolean palindrome(String text) {
        // write code here
        return (text.equalsIgnoreCase(reverse(text)));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
