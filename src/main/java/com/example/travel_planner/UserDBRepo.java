package com.example.travel_planner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDBRepo extends JpaRepository<UserDBEntity,Long>{

    
}
