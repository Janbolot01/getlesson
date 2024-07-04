package service.serviceImpl;

import dao.HospitalDao;
import dao.daoImpl.HospitalDaoImpl;
import models.Hospital;
import service.HospitalService;

import java.util.List;
import java.util.Optional;

public class HospitalServiceImpl implements HospitalService {

   final   HospitalDao hospitalDao = new HospitalDaoImpl();
    @Override
    public List<Hospital> findAllHospitals() {
        return hospitalDao.findAllHospitals();
    }

    @Override
    public Optional<Hospital> getHospitalByID(Long id) {
        return hospitalDao.getHospitalByID(id);



    @Override
    public String updateHospital(Long id, Hospital hospital) {
        return null;
    }

    @Override
    public String deleteHospitalById(Long id) {
        return null;
    }

    @Override
    public Hospital getHospitalById(Long hosId) {
        return null;
    }
}
