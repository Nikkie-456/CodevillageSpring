package com.thecodevillage.myapp.room.service;

import com.thecodevillage.myapp.room.model.Room;
import com.thecodevillage.myapp.room.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServImpl implements RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomServImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> fetchAllRooms() {
        return null;
    }

    @Override
    public Room getRoomByNo(String roomNo) {
        return null;
    }

    @Override
    public Room saveRoom(Room room) {
        return null;
    }

    @Override
    public Room updateRoom(Room room) {
        return null;
    }
}
