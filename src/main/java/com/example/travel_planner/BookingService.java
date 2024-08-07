package com.example.travel_planner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    BookingRepo bookingRepo;

    public boolean createNewBooking(BookingEntity bookingEntity) {
        bookingRepo.save(bookingEntity);
        return true;
    }

    public List<BookingEntity> GetAllBookings() {
        return bookingRepo.findAll();
    }


    public boolean updateBooking(Long id, BookingEntity bookingEntity) {
        Optional<BookingEntity> optEntity = bookingRepo.findById(id);

        if(optEntity.isPresent()){
            BookingEntity entity = optEntity.get();
            entity.setAadharNo(bookingEntity.getAadharNo());
            entity.setAddress(bookingEntity.getAddress());
            entity.setName(bookingEntity.getName());
            entity.setPhoneNo(bookingEntity.getPhoneNo());
            entity.setTicketCount(bookingEntity.getTicketCount());
            entity.setUserId(bookingEntity.getUserId());
            bookingRepo.save(entity);
            return true;
        }
        return false;
    }

    public boolean deleteBooking(Long id) {
        Optional<BookingEntity> optEntity = bookingRepo.findById(id);
        
        if(optEntity.isPresent()){
            BookingEntity entity = optEntity.get();
            bookingRepo.delete(entity);
            return true;
        }
        return false;
    }

    public List<BookingEntity> getBookingsByUserId(Long userId) {
        return bookingRepo.getBookingsByUserId(userId);
    }
    
}
