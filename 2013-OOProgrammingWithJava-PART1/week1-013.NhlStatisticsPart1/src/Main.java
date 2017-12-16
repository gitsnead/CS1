import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        System.out.println("Top twenty-five by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        System.out.println("Sydney Crosby statistics");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        System.out.println("Players in Philadelphia Flyers (sorted by penalty)");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");
        System.out.println("Players in Anaheim Ducks (sorted by points)");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}