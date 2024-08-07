package com.example.travel_planner;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tour_packages")
public class TourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long tour_id;
    String tour_name;
    String tour_description;
    String tour_from_location;
    String tour_to_location;
    Date tour_from_date;
    Date tour_to_date;
    int no_of_days;
    int no_of_tickets;
    int ticket_price;
    String transport;
}
