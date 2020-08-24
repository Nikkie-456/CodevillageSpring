package com.thecodevillage.myapp.room.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
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
    public GenericResponse fetchAllRooms() {
        List<Room> room_1 = roomRepository.fetchAllRooms();
        if (room_1.size() > 0){
            return new GenericResponse(2001, "Rooms Fetched Successfully",room_1);}
        return new GenericResponse(2005, "Error Fetching Room");
    }

    @Override
    public GenericResponse getRoomByNo(String roomNo) {
        return null;
    }


    @Override
    public GenericResponse saveRoom(Room room){
        Room room_1 = roomRepository.save(room);
        if (room_1.getId() > 0){
            return new GenericResponse(2001, "Room Created Successfully",room_1);}
            return new GenericResponse(2005, "Error Creating Room");
    }


@Override
    public GenericResponse updateRoom(Room room) {
        Room room1 = roomRepository.save(room);
        if (room1.getId() > 0){
            return new GenericResponse(2002, "Updations Are Success",room1);}
        return new GenericResponse(2006, "Error Updating Room");
    }


}
