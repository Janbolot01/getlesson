package service;

import models.Hospital;

public interface HospitalService {
    String updateHospital(Long id , Hospital hospital);
    String deleteHospitalById(Long id);
    Hospital getHospitalById(Long hosId);
}
