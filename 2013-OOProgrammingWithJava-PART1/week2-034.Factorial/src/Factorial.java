import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int Maximum = Integer.parseInt(reader.nextLine());
        int Counter = 1;
        int Factorial = 1;
        while (Counter <= Maximum) {
            Factorial *= Counter;
            Counter++;
        }
        System.out.println("Factorial is " + Factorial);
    }
}
