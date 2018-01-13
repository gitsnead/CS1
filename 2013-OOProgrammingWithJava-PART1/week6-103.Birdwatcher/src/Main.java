import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            BirdDb birds = new BirdDb();
            Scanner reader = new Scanner(System.in);
            String command;
            while (true) {
                System.out.print("? ");
                command = reader.nextLine();
                if (command.trim().equalsIgnoreCase("quit")) {
                    break;
                } else if (command.trim().equalsIgnoreCase("add")) {
                    birds.addBird(reader);
                } else if (command.trim().equalsIgnoreCase("observation")) {
                    birds.observe(reader);
                } else if (command.trim().equalsIgnoreCase("show")) {
                    birds.showBird(reader);
                } else if (command.trim().equalsIgnoreCase("statistics")) {
                    birds.showStatistics();
                }
            }
    }

}
