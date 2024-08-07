package com.example.travel_planner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travel_planner")
public class AdminDBController {

    @Autowired
    AdminDBService adminDBService;

    @PostMapping("adminsignup")
    public boolean createNewAdmin(@RequestBody AdminDBEntity adminDBEntity) {
        return adminDBService.createNewAdmin(adminDBEntity);
    }

    @DeleteMapping("adminsignup/{id}")
    public boolean deleteAdmin(@PathVariable Long id){
        return adminDBService.deleteAdmin(id);
    }

    @GetMapping("adminsignup/{id}")
    public AdminDBEntity getAdmin(@PathVariable Long id) {
        return adminDBService.getAdmin(id);
    }

    @PutMapping("adminsignup/{id}")
    public boolean updateAdmin(@PathVariable Long id, @RequestBody AdminDBEntity adminDBEntity) {
        return adminDBService.updateAdmin(id,adminDBEntity);
    }
}
