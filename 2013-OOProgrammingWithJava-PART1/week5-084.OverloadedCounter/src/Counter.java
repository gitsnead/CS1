/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Counter {

    private int counter;
    private boolean isFloor0;

    public Counter() {
        this(0);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(int startingValue, boolean check) {
        if (startingValue < 0 && check) {
            this.counter = 0;
        } else {
            this.counter = startingValue;
        }
        this.isFloor0 = check;
    }

    public int value() {
        return this.counter;
    }

    public void printValue() {
        System.out.println("Value: " + this.value());
    }
    
    public void increase() {
        increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            int newCounter = this.counter - decreaseAmount;
            if (newCounter >= 0 || !this.isFloor0) {
                this.counter = newCounter;
            } else if (newCounter <= 0 && this.isFloor0) {
                this.counter = 0;                
            }
        }
    }
}
