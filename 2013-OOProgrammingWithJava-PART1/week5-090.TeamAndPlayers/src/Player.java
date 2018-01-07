/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Player {
    private String name;
    private int goals = 0;
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, int goals) {
        this(name);
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }
    
    @Override
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
    
    
}
