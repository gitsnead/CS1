
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        Scanner reader1 = new Scanner(System.in);
        int firstNumber = Integer.parseInt(reader1.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader1.nextLine());
        System.out.println("");
        System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));
    }
}
