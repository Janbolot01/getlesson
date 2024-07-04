package database;

import models.Doctor;
import models.Hospital;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public  List<Hospital> hospitals = new ArrayList<>();
    public List<Doctor> doctors = new ArrayList<>();

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
}
