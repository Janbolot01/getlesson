package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HospitalDaoImpl implements HospitalDao {
    @Override
    public List<Hospital> findAllHospitals() {
       return Database.hospitals ;
    }

    @Override
    public Optional<Hospital> getHospitalByID(Long id) {
        for (Hospital hospital:Database.hospitals){
            if(hospital.getId().equals(id)){
                return Optional.of(hospital);
            }
        }
        return Optional.empty();
    }
}
