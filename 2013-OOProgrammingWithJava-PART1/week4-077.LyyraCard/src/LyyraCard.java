/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class LyyraCard {

    private double balance;
    private final double economicalMeal = 2.5d;
    private final double gourmetMeal = 4d;
    private final double maxBalance = 150d;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }
        if (this.balance + amount > maxBalance) {
            this.balance = maxBalance;
        } else {
            this.balance += amount;
        }
    }

    @Override
    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= this.economicalMeal) {
            this.balance -= economicalMeal;
        }
    }

    public void payGourmet() {
        if (this.balance >= this.gourmetMeal) {
            this.balance -= gourmetMeal;
        }
    }
}
