
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        Scanner reader1 = new Scanner(System.in);
        int firstNumber = Integer.parseInt(reader1.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader1.nextLine());
        double quotient = (double)firstNumber/secondNumber;
        System.out.println("");
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + (quotient));
    }
}
