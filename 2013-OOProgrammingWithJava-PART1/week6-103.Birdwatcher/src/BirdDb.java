/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class BirdDb {

    ArrayList<Bird> birds;

    public BirdDb() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Scanner cmd) {
        System.out.print("Name: ");
        String name = cmd.nextLine();
        System.out.print("Latin Name: ");
        String latinName = cmd.nextLine();
        birds.add(new Bird(name, latinName));
    }

    public void observe(Scanner cmd) {
        System.out.print("What was observed:? ");
        String observation = cmd.nextLine();
        boolean found = false;
        for (Bird bird : this.birds) {
            if (bird.getName().equalsIgnoreCase(observation.trim())) {
                bird.addObservation();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Is not a bird!");
        }
    }

    public void showBird(Scanner cmd) {
        System.out.print("What? ");
        String item = cmd.nextLine();
        for (Bird bird : this.birds) {
            if (bird.getName().equalsIgnoreCase(item.trim())) {
                System.out.println(bird);
            }
        }
    }
    
    public void showStatistics() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
}
