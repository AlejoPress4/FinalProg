package Services;

import Model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DietPlanServices {
    private ArrayList<DietPlan> dietPlans;

    public DietPlanServices() {
        dietPlans = new ArrayList<DietPlan>();
    }

    public void add(DietPlan plan) {
        dietPlans.add(plan);
    }

    public void edit(DietPlan plan){
        
    }

    public void Delete(String dietPlanid) {
        for (DietPlan dietPlan : dietPlans) {
            if (Integer.toString(dietPlan.getDietPlanId()).equals(dietPlanid)) {
                dietPlans.remove(dietPlan);
            }
        }
    }

    public void saveToCSV() {
        String fileName = "dietPlans.csv";
        try {
            FileWriter csvWriter = new FileWriter(fileName);
            // Write header
            csvWriter.append("DietPlanId,Name\n");

            // Write data
            for (DietPlan dietPlan : dietPlans) {
                csvWriter.append(Integer.toString(dietPlan.getDietPlanId()));
                csvWriter.append(",");
                csvWriter.append(dietPlan.getName());
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to CSV file: " + e.getMessage());
        }
    }
}
