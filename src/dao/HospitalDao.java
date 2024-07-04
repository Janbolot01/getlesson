package dao;

import models.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalDao {
    List<Hospital> findAllHospitals();

    Optional<Hospital> getHospitalByID(Long id);
}
