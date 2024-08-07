package com.example.travel_planner;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class UserDBController {

    @Autowired
    UserDBService userDBService;

    @PostMapping("signup")
    public boolean createNewUser(@RequestBody UserDBEntity userDBEntity) {
        return userDBService.createNewUser(userDBEntity);
    }

    @DeleteMapping("signup/{id}")
    public boolean deleteUser(@PathVariable Long id){
        return userDBService.deleteUser(id);
    }

    @GetMapping("signup/{id}")
    public UserDBEntity getUser(@PathVariable Long id) {
        return userDBService.getUser(id);
    }

    @PutMapping("signup/{id}")
    public boolean updateUser(@PathVariable Long id, @RequestBody UserDBEntity userDBEntity) {
        return userDBService.updateUser(id,userDBEntity);
    }
    
    
}
