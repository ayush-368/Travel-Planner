package com.example.travel_planner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TourService {
    @Autowired
    TourRepo tourRepo;

    public List<TourEntity> getAllPackages() {
        return tourRepo.findAll();
        
    }

    public boolean insertPackage(TourEntity tourEntity) {
        tourRepo.save(tourEntity);
        return true;
    }

    public boolean DeletePackage(Long id) {
        Optional<TourEntity> optEntity = tourRepo.findById(id);
        
        if(optEntity.isPresent()){
            TourEntity entity = optEntity.get();
            tourRepo.delete(entity);
            return true;
        }
        return false;
    }

    public TourEntity getSinglePackage(Long id) {
        return tourRepo.findById(id).get();
    }

    public boolean updatePackage(Long id, TourEntity tourEntity) {
        Optional<TourEntity> optEntity = tourRepo.findById(id);
        
        if(optEntity.isPresent()){
             TourEntity entity = optEntity.get();
            //  BeanUtils.copyProperties(tourEntity, entity);
            entity.setTour_name(tourEntity.getTour_name());
            entity.setNo_of_days(tourEntity.getNo_of_days());
            entity.setNo_of_tickets(tourEntity.getNo_of_tickets());
            entity.setTicket_price(tourEntity.getTicket_price());
            entity.setTour_description(tourEntity.getTour_description());
            entity.setTour_from_date(tourEntity.getTour_from_date());
            entity.setTour_to_date(tourEntity.getTour_to_date());
            entity.setTour_from_location(tourEntity.getTour_from_location());
            entity.setTour_to_location(tourEntity.getTour_to_location());
            entity.setTransport(tourEntity.getTransport());

             tourRepo.save(entity);
             return true;
        }
        
        return false;
        
    }
    
}
