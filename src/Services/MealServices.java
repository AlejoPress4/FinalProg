package Services;
import java.util.ArrayList;
import Model.*;
public class MealServices {
    private ArrayList<Meal> meals;
    public MealServices(){
        meals = new ArrayList<Meal>();
    }
    public void add(Meal meal){
        meals.add(meal);
    }
    public void list(){
        for (Meal meal : meals) {
            System.out.println(meal.getCalories());
        }
    }
}
