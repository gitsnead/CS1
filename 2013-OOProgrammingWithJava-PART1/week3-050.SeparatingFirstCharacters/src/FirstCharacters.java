
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        Integer index = 0;
        while (index < 3 && name.length() > 2) {
            System.out.println((index + 1) + ". character: " + name.charAt(index));
            index++;
        }
    }
}
