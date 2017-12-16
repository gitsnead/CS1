
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String firstPersonName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String secondPersonName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println(firstPersonName + " and " + secondPersonName + " are " + (firstAge + secondAge) + " years old in total.");
    }
}
