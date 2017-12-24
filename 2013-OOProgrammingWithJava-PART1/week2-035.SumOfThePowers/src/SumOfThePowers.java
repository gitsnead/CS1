
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int Maximum = Integer.parseInt(reader.nextLine());
        int Counter = 0;
        int Result = 0;
        while (Counter <= Maximum) {
            Result += Math.pow(2, Counter);
            Counter++;
        }
        System.out.println("Result is " + Result);
    }
}
