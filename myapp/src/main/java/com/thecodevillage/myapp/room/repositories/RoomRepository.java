package com.thecodevillage.myapp.room.repositories;

import com.thecodevillage.myapp.room.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends PagingAndSortingRepository<Room,Long> {

    List<Room> fetchAllRooms();

    Optional<Room> findById(@Param("id") Long id);
}
