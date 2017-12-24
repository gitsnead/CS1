
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guessNumber = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int Guess = Integer.parseInt(reader.nextLine());
            guessNumber++;
            if (numberDrawn == Guess) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberDrawn < Guess) {
                System.out.println("The number is lesser, guesses made: " + guessNumber);
            } else if (numberDrawn > Guess) {
                System.out.println("The number is greater, guesses made: " + guessNumber);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
