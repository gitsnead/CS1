
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private final int ballCount = 39;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int numberDraw;
        int ball = 0;
        while (ball < 7) {
            while (true) {
                numberDraw = random.nextInt(ballCount) + 1;
                if (!this.containsNumber(numberDraw)) {
                    this.numbers.add(numberDraw);
                    break;
                }
            }
            ball++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        return this.numbers.contains(number);
    }
}
