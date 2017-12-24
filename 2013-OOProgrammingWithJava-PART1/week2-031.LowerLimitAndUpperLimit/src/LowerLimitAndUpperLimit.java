
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int First = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int Last = Integer.parseInt(reader.nextLine());
        int counter = First;
        while(counter <= Last) {
            System.out.println(counter);
            counter++;
        }
    }
}
