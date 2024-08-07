package com.example.travel_planner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    Long userId;
    String name;
    String address;
    long aadharNo;
    long phoneNo;
    int ticketCount;    
}
