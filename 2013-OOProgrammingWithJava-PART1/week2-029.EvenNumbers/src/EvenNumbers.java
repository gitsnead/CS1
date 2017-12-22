
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int counter = 1;
        while (counter <= 100) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
