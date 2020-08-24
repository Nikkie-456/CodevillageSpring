package com.thecodevillage.myapp.room.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Table(name="mst_room")
@NamedQueries({@NamedQuery(name="Room.fetchAllRooms",query = "select r from Room r")})
@NamedQuery(name = "Room.findRoomById",query = "select r from Room r where r.id= :id")
public class Room implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String roomNo;
    private String roomDesc;

    public Room(){

    }

    public Room(long id, String roomNo, String roomDesc) {
        this.id = id;
        this.roomNo = roomNo;
        this.roomDesc = roomDesc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }
}
