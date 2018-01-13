/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getName() {
        return name;
    }

    public int getObservations() {
        return observations;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public void addObservation() {
        this.observations++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
    
    
}
