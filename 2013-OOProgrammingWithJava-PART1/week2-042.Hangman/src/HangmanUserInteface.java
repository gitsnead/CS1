
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        String Command;
        while (hangman.gameOn()) {
            System.out.println("Type a command:");
            Command = reader.nextLine();
            if (Command.equalsIgnoreCase("quit")) {
                break;
            } else if (Command.equalsIgnoreCase("status")) {
                hangman.printStatus();
            } else if (Command.length() == 1) {
                hangman.guess(Command);
                hangman.printMan();
                hangman.printWord();
            } else if (Command.isEmpty()) {
                printMenu();
            }
            hangman.printWord();
            hangman.printMan();
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
