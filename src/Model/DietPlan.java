package Model;
import java.util.ArrayList;
import java.util.List;


public class DietPlan {
    private int dietPlanId = 0;
    private String name = "";
    private String description = "";
    private List<Meal> meals = new ArrayList<>();
    private String dietitianId = "";
    private String patientId = "";

    public DietPlan(int dietPlanId, String name, String description, List<Meal> meals, String dietitianId, String patientId) {
        this.dietPlanId = dietPlanId;
        this.name = name;
        this.description = description;
        this.meals = meals;
        this.dietitianId = dietitianId;
        this.patientId = patientId;
    }

    public int getDietPlanId() {
        return dietPlanId;
    }

    public void setDietPlanId(int dietPlanId) {
        this.dietPlanId = dietPlanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 30) {
            System.out.println("The name of the diet plan is too long");
        } else {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 100) {
            System.out.println("The description of the diet plan is too long");
        } else {
            this.description = description;
        }
    }

    public String[] getMeals() {
        List<String> mealNames = new ArrayList<>();
        for (Meal meal : meals) {
            mealNames.add(meal.getName());
        }
        return mealNames.toArray(new String[0]);
    }

    public void addMeal(Meal meal) {
        this.meals.add(meal);
    }

    public String getDietitianId() {
        return dietitianId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String toCSV() {
        return dietPlanId + "," + name + "," + description + "," + dietitianId + "," + patientId + "," +"";
    }
}