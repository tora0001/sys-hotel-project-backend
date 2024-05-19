package org.example.syshotelprojectbackend.repositories;

import org.example.syshotelprojectbackend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
