package com.example.travel_planner;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<BookingEntity,Long> {
    List<BookingEntity> getBookingsByUserId(Long userId);
}

