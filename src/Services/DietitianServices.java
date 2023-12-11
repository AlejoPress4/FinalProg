package Services;
import java.util.ArrayList;
import Model.*;
import java.io.FileWriter;
import java.io.IOException;
public class DietitianServices {
    private ArrayList<Dietitian> dietitians;
    public DietitianServices(){
        dietitians = new ArrayList<Dietitian>();
    }
    public void add(Dietitian dietitian){
        dietitians.add(dietitian);
    }
    public void list(){
        for (Dietitian dietitian : dietitians) {
            System.out.println(dietitian.getName());
        }
    }
    public void Delete(String dietitianid){
        for (Dietitian dietitian : dietitians) {
            if(dietitian.getDietitianId().equals(dietitianid)){
                dietitians.remove(dietitian);
            }
        }
    }
    public Dietitian getDietitian(String dietitianid){
        Dietitian dietit = null;
        for (Dietitian dietitian : dietitians) {
            if(dietitian.getDietitianId().equals(dietitianid)){
                dietit = dietitian;
            }
        }
        return dietit;
        
    }

public void saveToCSV() {
    String fileName = "dietitians.csv";
    try {
        FileWriter csvWriter = new FileWriter(fileName);
        // Write header
        csvWriter.append("DietitianId,Name\n");

        // Write data
        for (Dietitian dietitian : dietitians) {
            csvWriter.append(dietitian.getDietitianId());
            csvWriter.append(",");
            csvWriter.append(dietitian.getName());
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
    } catch (IOException e) {
        System.out.println("An error occurred while writing to CSV file: " + e.getMessage());
    }
}
}
