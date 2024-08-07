package com.example.travel_planner;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/travel_planner")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("booking")
    public boolean createNewBooking(@RequestBody BookingEntity bookingEntity) {
        return bookingService.createNewBooking(bookingEntity);
    }

    @GetMapping("booking")
    public List<BookingEntity> GetAllBookings() {
        return bookingService.GetAllBookings();
    }

    @GetMapping("booking/{userId}")
    public List<BookingEntity> getBookingsByUserId(@PathVariable Long userId) {
        return bookingService.getBookingsByUserId(userId);
    }
    

    @PutMapping("booking/{id}")
    public boolean updateBooking(@PathVariable Long id, @RequestBody BookingEntity bookingEntity) {
        return bookingService.updateBooking(id,bookingEntity);
    }

    @DeleteMapping("booking/{id}")
    public boolean deleteBooking(@PathVariable Long id){
        return bookingService.deleteBooking(id);
    }
    
    
    
}
