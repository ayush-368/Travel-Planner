package com.example.travel_planner;

import java.nio.file.OpenOption;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserDBService {

    @Autowired
    UserDBRepo userDBRepo;

    public boolean createNewUser(UserDBEntity userDBEntity) {
        userDBRepo.save(userDBEntity);
        return true;
    }

    public boolean deleteUser(Long id) {
        Optional<UserDBEntity> optionalEntity = userDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            UserDBEntity entity = optionalEntity.get();
            userDBRepo.delete(entity);
            return true;
        }
        return false;
    }

    public UserDBEntity getUser(Long id) {
        Optional<UserDBEntity> optionalEntity = userDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            UserDBEntity entity = optionalEntity.get();
            return entity;
        }
        return null;        
    }

    public boolean updateUser(Long id, UserDBEntity userDBEntity) {
        Optional<UserDBEntity> optionalEntity = userDBRepo.findById(id);

        if(optionalEntity.isPresent()){
            UserDBEntity entity = optionalEntity.get();
            entity.setEmail(userDBEntity.getEmail());
            entity.setName(userDBEntity.getName());
            entity.setPass(userDBEntity.getPass());
            userDBRepo.save(entity);
            return true;
        }
        return false;           
    }
}
