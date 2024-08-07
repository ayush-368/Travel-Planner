package com.example.travel_planner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="admins")
public class AdminDBEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    String Name;
    String email;
    String Pass;
}
