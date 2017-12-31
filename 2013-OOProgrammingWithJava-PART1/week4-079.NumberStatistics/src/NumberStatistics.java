
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        if (this.amountOfNumbers > 0) {
            return ((this.sum + 0d) / this.amountOfNumbers);
        } else {
            return 0;
        }
    }
}
