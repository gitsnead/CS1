
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account myAccount = new Account("me", 100d);
        myAccount.deposit(20d);
        System.out.println(myAccount.toString());
    }

}
