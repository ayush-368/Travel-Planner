package com.example.travel_planner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDBService {

    @Autowired
    AdminDBRepo adminDBRepo;

    public boolean createNewAdmin(AdminDBEntity adminDBEntity) {
        adminDBRepo.save(adminDBEntity);
        return true;
    }

    public boolean deleteAdmin(Long id) {
        Optional<AdminDBEntity> optionalEntity = adminDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            AdminDBEntity entity = optionalEntity.get();
            adminDBRepo.delete(entity);
            return true;
        }
        return false;
    }

    public AdminDBEntity getAdmin(Long id) {
        Optional<AdminDBEntity> optionalEntity = adminDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            AdminDBEntity entity = optionalEntity.get();
            return entity;
        }
        return null;        
    }

    public boolean updateAdmin(Long id, AdminDBEntity adminDBEntity) {
        Optional<AdminDBEntity> optionalEntity = adminDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            AdminDBEntity entity = optionalEntity.get();
            entity.setEmail(adminDBEntity.getEmail());
            entity.setName(adminDBEntity.getName());
            entity.setPass(adminDBEntity.getPass());
            adminDBRepo.save(entity);
            return true;
        }
        return false;           
    }
}
