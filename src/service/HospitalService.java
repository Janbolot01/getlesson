package service;

import models.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    List<Hospital> findAllHospitals();

    Optional<Hospital> getHospitalByID(Long id);

    String updateHospital(Long id , Hospital hospital);
    String deleteHospitalById(Long id);
    Hospital getHospitalById(Long hosId);
}
