
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economyPrice = 2.5d;
    private final double gourmetPrice = 4d;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000d;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    private double payCash(double amountPaid, double price) {
        this.cashInRegister += price;
        return amountPaid - price;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            double change = payCash(sum, sum);
            if (change == 0) {
                card.loadMoney(sum);
            }
        }
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= this.economyPrice) {
            this.economicalSold++;
            return payCash(cashGiven, this.economyPrice);
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= this.gourmetPrice) {
            this.gourmetSold++;
            return payCash(cashGiven, this.gourmetPrice);
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= this.economyPrice) {
            this.economicalSold++;
            card.pay(this.economyPrice);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= this.gourmetPrice) {
            this.gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }
        return false;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
