package Model;
import java.util.List;

public class Patient {
    private String PatientId = "";
    private String name = "";
    private byte age = 0;
    private float weight = 0;
    private float height = 0;
    List<String> preexistingConditions;

    public Patient(String PatientId, String name, byte age, float weight, float height, List<String> preexistingConditions) {
        this.PatientId = PatientId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.preexistingConditions = preexistingConditions;
    }

    //Methods to get and set the values of the attributes :)
    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeigth() {
        return weight;
    }

    public void setWeigth(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public List<String> getPreexistingConditions() {
        return preexistingConditions;
    }

    public void setPreexistingConditions(List<String> preexistingConditions) {
        this.preexistingConditions = preexistingConditions;
    }
}