package org.example.syshotelprojectbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RoomTypeID;
    private int Beds;
    private int RoomPrice;
    private String RoomDesc;

    public int getRoomTypeID() {
        return RoomTypeID;
    }

    public void setRoomTypeID(int roomTypeID) {
        RoomTypeID = roomTypeID;
    }

    public int getBeds() {
        return Beds;
    }

    public void setBeds(int beds) {
        Beds = beds;
    }

    public int getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        RoomPrice = roomPrice;
    }

    public String getRoomDesc() {
        return RoomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        RoomDesc = roomDesc;
    }
}
