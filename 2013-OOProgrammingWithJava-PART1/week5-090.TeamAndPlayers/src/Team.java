/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void addPlayer(Player newPlayer) {
        if (this.players.size() < this.maxSize) {
            this.players.add(newPlayer);
        }
    }

    public void printPlayers() {
        for (Player member : players) {
            System.out.println(member);
        }
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int teamGoals = 0;
        for(Player member : players) {
            teamGoals += member.goals();
        }
        return teamGoals;
    }
}
