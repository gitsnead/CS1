
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String temperatureReading;
        double newTemperature;
        // Write your code here. 
        while (true) {
            System.out.print("Temperature reading (exit to quit): ");
            temperatureReading = reader.nextLine();
            if (temperatureReading.equals("exit")) {
                break;
            } else {
                newTemperature = Double.parseDouble(temperatureReading);
                if (newTemperature >= -30.0 && newTemperature <= 40.0) {
                    Graph.addNumber(newTemperature);
                } else {
                    System.out.println("Bad temperature reading!");
                }
            }
        }

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
