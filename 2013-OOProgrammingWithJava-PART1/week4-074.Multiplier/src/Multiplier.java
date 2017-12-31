/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Multiplier {
    private final int multiplicator;
    
    public Multiplier(int number) {
        this.multiplicator = number;
    }
    
    public int multiply(int otherNumber) {
        return (this.multiplicator * otherNumber);
    }
}
