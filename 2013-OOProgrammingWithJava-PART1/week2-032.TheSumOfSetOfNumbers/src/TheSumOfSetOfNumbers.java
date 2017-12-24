
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int What = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int Total = 0;
        while(counter <= What) {
            Total += counter;
            counter++;
        }
        System.out.println("Sum is " + Total);
    }
}
