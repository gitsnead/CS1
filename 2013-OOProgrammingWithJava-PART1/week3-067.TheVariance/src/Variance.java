
import java.util.ArrayList;
import java.math.*;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int listTotal = 0;
        for(int listItem : list) {
            listTotal += listItem;
        }
        return listTotal;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        // write code here
        return sum(list) / (list.size() + 0.0d);
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double sampleVariance = 0;
        for (int item : list) {
            sampleVariance += Math.pow((item - avg), 2);
        }
        if (list.size() == 1) {
            return 0;
        } else {
            return sampleVariance / (list.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
