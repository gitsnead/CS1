import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int charsToPrint = Integer.parseInt(reader.nextLine());
        if (word.length() > charsToPrint) {
            System.out.println("Result: " + word.substring(word.length() - charsToPrint));
        }
    }
}
