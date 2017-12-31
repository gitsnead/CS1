
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String description) {
        if (!this.meals.contains(description)) {
            this.meals.add(description);
        }
    }

    public void printMeals() {
        for (String item : this.meals) {
            System.out.println(item);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
