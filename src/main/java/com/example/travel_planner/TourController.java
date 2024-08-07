package com.example.travel_planner;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class TourController {
    @Autowired
    TourService tourService;

    @GetMapping("tours")
    public List<TourEntity> getAllPackages() {
        return tourService.getAllPackages();
    }

    @PostMapping("tours")
    public boolean insertPackage(@RequestBody TourEntity tourEntity) {
        return tourService.insertPackage(tourEntity);
    }

    @DeleteMapping("tours/{id}")
    public boolean DeletePackage(@PathVariable Long id){
        return tourService.DeletePackage(id);
    }

    @GetMapping("tours/{id}")
    public TourEntity getSinglePackage(@PathVariable Long id) {
        return tourService.getSinglePackage(id);
    }

    @PutMapping("tours/{id}")
    public boolean updatePackage(@PathVariable Long id, @RequestBody TourEntity tourEntity) {    
        return tourService.updatePackage(id,tourEntity);
    }
    
    
    
}
