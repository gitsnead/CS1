
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account accountA = new Account("A", 100d);
        Account accountB = new Account("B", 0d);
        Account accountC = new Account("C", 0d);
        transfer(accountA, accountB, 50d);
        transfer(accountB, accountC, 25d);
    }


}
