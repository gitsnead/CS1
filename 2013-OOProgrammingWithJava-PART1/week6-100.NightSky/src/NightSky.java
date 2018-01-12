
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ryanw
 */
public class NightSky {

    private double density = 0.1;
    private int width = 20;
    private int height = 10;
    private int starsInSky = 0;

    public NightSky(double density) {
        this.density = density;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random rand = new Random();

        for (int i = 0; i < this.width; i++) {
            if (this.density >= rand.nextDouble()) {
                System.out.print("*");
                this.starsInSky += 1;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public int starsInLastPrint() {
        int starCount = this.starsInSky;
        this.starsInSky = 0;
        return starCount;
    }
    public void print() {
        for (int j = 0; j < this.height; j++) {
            printLine();
        }
    }
}
