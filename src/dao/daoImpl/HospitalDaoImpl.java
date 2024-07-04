package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;

public class HospitalDaoImpl implements HospitalDao {
    private Database database;

    @Override
    public String updateHospital(Long id, Hospital hospital) {
        for(Hospital hospital1:Database.hospitals){
            if (hospital1.getId().equals(id)){
                hospital1.setHospitalName(hospital.getHospitalName());
                hospital1.setAddress(hospital.getAddress());
                return "Successfully updated";
            }
            else System.out.println("Not found Hospital id");
        }
        return null;
    }

    @Override
    public String deleteHospitalById(Long id) {
        for(Hospital hospital:Database.hospitals){
            if (hospital.getId().equals(id)){
                Database.hospitals.remove(hospital);
                return "Successfully deleted";
            }else System.out.println("Not found Hospital id");
        }
        return "Please provide included id";
    }

    @Override
    public Hospital getHospitalById(Long hosId) {
        for (Hospital hospital:Database.hospitals){
            if (hospital.getId().equals(hosId)){
                return hospital;
            }else System.out.println("Not found Hospital");
        }
        return null;
    }
}
