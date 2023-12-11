package Model;
import java.lang.String;

public class Dietitian {
    private String dietitianId = "";
    private String name = "";
    private String specialty = "";

    public Dietitian(String dietitianId, String name, String specialty) {
        this.dietitianId = dietitianId;
        this.name = name;
        this.specialty = specialty;
    }

    public String getDietitianId() {
        return dietitianId;
    }

    public void setDietitianId(String dietitianId) {
        this.dietitianId = dietitianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getspecialty() {
        return specialty;
    }

    public void setspecialty(String specialty) {
        this.specialty = specialty;
    }

}


