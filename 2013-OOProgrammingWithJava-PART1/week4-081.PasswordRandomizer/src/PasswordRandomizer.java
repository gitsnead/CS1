import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int passwordLength;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        random = new Random();
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int characterPosition = 0;
        String password = "";
        while (characterPosition < this.passwordLength) {
            password += alphabet.charAt(random.nextInt(alphabet.length()));
            characterPosition++;
        }
        return password;
    }
}
