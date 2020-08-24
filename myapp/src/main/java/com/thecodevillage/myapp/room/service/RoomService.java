package com.thecodevillage.myapp.room.service;

import com.thecodevillage.myapp.room.model.Room;

import java.util.List;

public interface RoomService {

    List<Room> fetchAllRooms();

    Room getRoomByNo(String roomNo);

    Room saveRoom(Room room);

    Room updateRoom(Room room);
}
