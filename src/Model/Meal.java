package Model;


public class Meal {
    private String name = "";
    private String macronutrients = "";
    private int calories = 0;
    private byte timeofday = 0;

    public Meal(String name, String macronutrients, int calories, byte timeofday) {
        this.name = name;
        this.macronutrients = macronutrients;
        this.calories = calories;
        this.timeofday = timeofday;
    }
    public String getName() {
        return name;
    }
    public String SetName(String name) {
        if (name.length() > 30) {
            System.out.println("The name of the meal is too long");
        } else {
            this.name = name;
        }
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public int setCalories(int calories) {
        if (calories > 1000) {
            System.out.println("The calories of the meal are too high");
        } else {
            this.calories = calories;
        }
        return calories;
    }

    public String setMacronutrients(String macronutrients) {
        if (macronutrients.length() > 100) {
            System.out.println("The macronutrients of the meal are too long");
        } else {
            this.macronutrients = macronutrients;
        }
        return macronutrients;
    }
    public String getMacronutrients() {
        return macronutrients;
    }
    public byte getTimeofday() {
        return timeofday;
    }
    public byte setTimeofday(byte timeofday) {
        if (timeofday > 3) {
            System.out.println("The time of day of the meal is not valid");
        } else {
            this.timeofday = timeofday;
        }
        return timeofday;
    }
}
