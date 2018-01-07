
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 

    private int value;
    private int upperLimit;
    private final int lowerLimit = 0;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void setValue(int newValue) {
        if (newValue >= lowerLimit && newValue <= upperLimit) {
            this.value = newValue;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }

    public void next() {
        // write code here
        if (this.value == upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    @Override
    public String toString() {
        // write code here
        return String.format("%02d", this.value);
    }
}