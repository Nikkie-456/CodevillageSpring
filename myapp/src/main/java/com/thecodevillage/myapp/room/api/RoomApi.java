package com.thecodevillage.myapp.room.api;


import com.thecodevillage.myapp.item.models.GenericResponse;
import com.thecodevillage.myapp.room.model.Room;
import com.thecodevillage.myapp.room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomApi {

    private RoomService roomService;

    @Autowired
    public RoomApi(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity createRoom(@RequestBody Room room){
        try{
            System.out.println("Create New Room");
            System.out.println("Room Name: " +room.getRoomDesc());
            roomService.saveRoom(room);
            GenericResponse genericResponse = new GenericResponse(2001, "Room Created Successfully", room);
            return new ResponseEntity<>(genericResponse, HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while creating Room.");
        }
        return null;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ResponseEntity viewRooms() {
        System.out.println("Fetch Rooms from  Database ");

        List<Room> rooms = roomService.fetchAllRooms();

        GenericResponse genericResponse = new GenericResponse(2002, "Rooms Fetched Successfully", rooms);

        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public ResponseEntity editRoom(@RequestBody Room room){
        try{
            System.out.println("Edit Room Details");
            System.out.println("Student Name: " +room.getRoomDesc());
            roomService.updateRoom(room);
            GenericResponse genericResponse = new GenericResponse(2001, "Updations Done Successfully", room);
            return new ResponseEntity<>(genericResponse, HttpStatus.OK);}
        catch (Exception h){
            System.out.println("Error while updating Room Details.");
        }
        return null;
    }
}
