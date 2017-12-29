import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        Integer index = name.length();
        while (index > 0) {
            System.out.print(name.charAt(index-1));
            index -= 1;
        }
        System.out.println("");
    }
}
