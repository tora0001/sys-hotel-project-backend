package org.example.syshotelprojectbackend.repositories;

import org.example.syshotelprojectbackend.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomType, Integer> {
}
