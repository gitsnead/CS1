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
public class Gradebook {

    private ArrayList<Integer> grades;

    public Gradebook() {
        this.grades = new ArrayList<Integer>();
    }

    public void recordGrades(Scanner inputs) {
        int number = 0;
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            number = Integer.parseInt(inputs.nextLine());
            if (number == -1) {
                break;
            }
            if (number >= 0 && number <= 60) {
                this.addGrade(number);
            }
        }
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private void printBar(int score) {
        int lowb = -1;
        int highb = -1;
        switch (score) {
            case 5:
                lowb = 50;
                highb = 60;
                break;
            case 4:
                lowb = 45;
                highb = 49;
                break;
            case 3:
                lowb = 40;
                highb = 44;
                break;
            case 2:
                lowb = 35;
                highb = 39;
                break;
            case 1:
                lowb = 30;
                highb = 34;
                break;
            case 0:
                lowb = 0;
                highb = 29;
                break;
            default:
                break;
        }
        System.out.print(score + ": ");
        for (int grade : this.grades) {
            if (grade >= lowb && grade <= highb) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

    private void printAcceptance() {
        int accepted = 0;
        for(int grade : this.grades) {
            if (grade >= 30) {
                accepted++;
            }
        }
        System.out.println("Acceptance percentage: " + (100d * accepted/this.grades.size()));
    }
    
    public void printHistogram() {
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            printBar(i);
        }
        printAcceptance();
    }

}
