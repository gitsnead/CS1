
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int First = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int Last = Integer.parseInt(reader.nextLine());
        int Total = 0;
        int counter = First;
        while (counter <= Last) {
            Total += counter;
            counter++;
        }
        System.out.println("Sum is " + Total);
    }
}
