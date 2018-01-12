
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money added) {
        return new Money(this.euros + added.euros(), this.cents + added.cents());
    }
    
    public Money minus(Money decremented) {
        int euroAmt = this.euros();
        int centAmt = this.cents();
        if (this.cents < decremented.cents) {
            euroAmt -= 1;
            centAmt = centAmt + 100 - decremented.cents();
        } else {
            centAmt = centAmt - decremented.cents();
        }
        if (euroAmt < decremented.euros) {
            return new Money(0, 0);
        }
        return new Money(euroAmt - decremented.euros(), centAmt);
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
