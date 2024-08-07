package com.example.travel_planner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepo extends JpaRepository<TourEntity,Long>{
    
}
