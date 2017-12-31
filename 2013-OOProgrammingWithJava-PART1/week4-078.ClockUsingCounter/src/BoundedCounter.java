/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class BoundedCounter {

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
