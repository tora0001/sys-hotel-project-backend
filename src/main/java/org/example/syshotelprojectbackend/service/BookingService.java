package org.example.syshotelprojectbackend.service;

import org.example.syshotelprojectbackend.model.Booking;
import org.example.syshotelprojectbackend.model.Room;
import org.example.syshotelprojectbackend.repositories.BookingRepository;
import org.example.syshotelprojectbackend.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {
        // Assume we have a method to fetch bookings by room ID
        public boolean isRoomAvailable(int roomID, Date startDate, Date endDate) {
            List<Booking> bookings = getBookingsByRoomID(roomID);

            for (Booking booking : bookings) {
                if (datesOverlap(startDate, endDate, booking.getArrivalDate(), booking.getDepartureDate())) {
                    return false; // Room is occupied during the requested period
                }
            }
            return true; // Room is available
        }

        private boolean datesOverlap(Date start1, Date end1, Date start2, Date end2) {
            return start1.before(end2) && start2.before(end1);
        }

        private List<Booking> getBookingsByRoomID(int roomID) {
            // Fetch bookings from database by roomID
            // This is a placeholder for the actual database query
            return List.of();
        }
}

