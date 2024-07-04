package dao.daoImpl;

import dao.DoctorDao;
import database.Database;
import models.Doctor;

public class DoctordaoImpl implements DoctorDao {
    private Database database;
    @Override
    public void getbyById(Long id) {
        for (Doctor doctor: database.doctors){
            if (doctor.getId().equals(id)){
                System.out.println(doctor);
            }
        }
    }

    @Override
    public void abdeitbyid(Long id, Long id1) {
        for (Doctor doctor: database.doctors){
            if (doctor.getId().equals(id)){
                System.out.println("алмаштыы");
            }
        }

    }


}
