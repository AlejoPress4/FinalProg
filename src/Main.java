import Helpers.*;
import Model.*;
import Services.*;
import java.util.List;
import java.util.ArrayList;

public class Main {

    // start the Services- List of objects
    static PatientsServices patients;
    static DietitianServices dietitians;
    static MealServices meals;
    static DietPlanServices dietPlans;
    static Dietitian log;

    public static void main(String[] args) {
        patients = new PatientsServices();
        dietitians = new DietitianServices();
        meals = new MealServices();
        dietPlans = new DietPlanServices();
        Dietitian log = null;
        run();

    }

    public static void run() {

        int key = 1;
        while (key != 5) {
            key = Keyboard.readInt(1, 4,
                    "\nWelcome to the diet plan app\n1.Login as a dietitian \n2. Register Dietitian \n3. Support \n4. Exit\n");
            switch (key) {
                case 1:
                    //login();
                    dietitianMenu();
                    break;
                case 2:
                    createDietitian();
                    break;
                case 3:
                    System.out.println(
                            "For support please contact us at 3202116476 or email us at alejandro.preciado40201@ucaldas.edu.co");
                    break;
                case 4:
                    close();
                    break;
            }
        }
    }

    public static void createPatient() {
        boolean ok = true;
        String name = Helpers.Keyboard.readString("Enter patient name");
        String idpatient = Helpers.Keyboard.readString("Enter patient id");
        Byte age = Helpers.Keyboard.readByte("Enter patient age");
        Float weight = Helpers.Keyboard.readFloat("Enter patient weight");
        Float height = Helpers.Keyboard.readFloat("Enter patient height");

        List<String> preexistingConditions = new ArrayList<String>();
        while (ok) {
            String opcion;
            opcion = Keyboard.readString("Entre preexisting condition or 0 to exit");
            if (!(opcion.equals("0")))
                preexistingConditions.add(opcion);
            else {
                ok = false;
            }
        }
        Patient user = new Patient(idpatient, name, age, weight, height, preexistingConditions);
        patients.add(user);
    }

    public static void createDietitian() {
        String name = Helpers.Keyboard.readString("Enter dietitian name");
        String iddietitian = Helpers.Keyboard.readString("Enter dietitian id");
        String specialty = Helpers.Keyboard.readString("Enter dietitian specialty");
        Dietitian user = new Dietitian(iddietitian, name, specialty);
        dietitians.add(user);
    }

    public static Meal mealregister() {
        String macronutrients = "";
        String name = Helpers.Keyboard.readString("Enter meal name");
        macronutrients = Keyboard.readString("Enter meal macronutrients or 0 to exit");
        int calories = Helpers.Keyboard.readInt("Enter meal calories");
        byte timeofday = Helpers.Keyboard.readByte("Enter meal timeofday");

        return new Meal(name, macronutrients, calories, timeofday);

    }

    public static void CreatePlan(Patient patient){ 
        boolean ok = true;
        List<Meal> meals = new ArrayList<Meal>();
        int dietPlanId = Helpers.Keyboard.readInt("Enter plan id");
        String name = Helpers.Keyboard.readString("Enter plan name");
        String description = Helpers.Keyboard.readString("Enter plan description");
        int calories = Helpers.Keyboard.readInt("Enter plan calories");
        while (ok){
            int option = Helpers.Keyboard.readInt(0,1,"Enter 1 to add a meal or 0 to exit");
            if (option == 0){
                ok = false;
            }else{
                meals.add(mealregister());
            }
        }; 
        
        DietPlan plan = new DietPlan (dietPlanId, name, description, meals,log.getDietitianId(),patient.getPatientId());
        dietPlans.add(plan);
    }

    public static void editDietPlan() {
        //TODO

    }

    public static void editPatient() {

    }

    public static void deletePatient() {
        String oldid = Helpers.Keyboard.readString("Enter patient id");
        patients.Delete(oldid);
    }

    public static void deleteDietitian() {

    }

    public static void login() {
        boolean ok = true;
        while (ok) {
            String name;
            String id;
            Dietitian dietitian;
            name = Keyboard.readString("Enter your name");
            id = Keyboard.readString("Enter your id");
            dietitian = dietitians.getDietitian(id);
            if (dietitian != null) {
                if (dietitian.getName().equals(name) && dietitian.getDietitianId().equals(id)) {
                    log = dietitian;
                    run();
                } else {
                    System.out.println("The name or the id are incorrect");
                }
            } else {
                System.out.println("The user does not exist");
            }
        }
    }

    public static void dietitianMenu() {

        int key = 1;
        while (key != 5) {
            key = Keyboard.readInt(1, 4,
                    "\nWelcome to the diet plan app\n1. Create patient \n2. Edit patient \n3. Delete patient \n4. Exit\n");
            switch (key) {
                case 1:
                    createPatient();
                    break;
                case 2:
                    editPatient();
                    break;
                case 3:
                    deletePatient();
                    break;
                case 4:
                    close();
                    break;
            }
        }
    }

    public static void close(){
        patients.saveToCSV();
        dietitians.saveToCSV();
        dietPlans.saveToCSV();
        System.exit(0); 
    }
}