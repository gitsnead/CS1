
import java.util.Scanner;

public class Main {

    public static void print2Cards(LyyraCard cardFirst, LyyraCard cardSecond) {
        System.out.println("Pekka: " + cardFirst);
        System.out.println("Brian: " + cardSecond);        
    }
    
    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // write code here
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        print2Cards(cardPekka, cardBrian);
        
        cardPekka.loadMoney(20d);
        cardBrian.payGourmet();
        print2Cards(cardPekka, cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50d);
        print2Cards(cardPekka, cardBrian);

    }
}
