
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsMoney = new Account("Matt's account", 1000d);
        Account myMoney = new Account("My account", 0d);
        mattsMoney.withdrawal(100d);
        myMoney.deposit(100d);
        System.out.println(mattsMoney.toString());
        System.out.println(myMoney.toString());
    }

}
