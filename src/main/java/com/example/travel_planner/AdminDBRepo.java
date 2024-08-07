package com.example.travel_planner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDBRepo extends JpaRepository<AdminDBEntity,Long> {
    
}
