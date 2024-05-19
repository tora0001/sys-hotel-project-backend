package org.example.syshotelprojectbackend.repositories;

import org.example.syshotelprojectbackend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
