package com.thecodevillage.myapp.room.service;

import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.room.model.Room;

import java.util.List;

public interface RoomService {

    GenericResponse fetchAllRooms();

    GenericResponse getRoomByNo(String roomNo);

    GenericResponse saveRoom(Room room);

    GenericResponse updateRoom(Room room);

}
