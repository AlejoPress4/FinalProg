package Services;

import java.util.ArrayList;
import Model.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * PatientsServices
 */
public class PatientsServices {

    private ArrayList<Patient> patients;

    public PatientsServices() {
        patients = new ArrayList<Patient>();
    }

    public void add(Patient paciente) {

        patients.add(paciente);
    }

    public void list() {
        for (Patient paciente : patients) {
            System.out.println(paciente.getName());
        }
    }

    public void Delete(String patientid) {
        for (Patient paciente : patients) {
            if (paciente.getPatientId().equals(patientid)) {
                patients.remove(paciente);
            }
        }
    }

    public void saveToCSV() {
        String fileName = "patients.csv";
        try {
            FileWriter csvWriter = new FileWriter(fileName);
            // Write header
            csvWriter.append("PatientId,Name\n");

            // Write data
            for (Patient patient : patients) {
                csvWriter.append(patient.getPatientId());
                csvWriter.append(",");
                csvWriter.append(patient.getName());
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to CSV file: " + e.getMessage());
        }
    }
}
