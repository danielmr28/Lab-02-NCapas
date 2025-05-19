package com.dog.controller;

import com.dog.dto.response.RoomResponse;
import com.dog.exception.RoomNotFoundException;
import com.dog.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    // GET /api/room
    @GetMapping()
    public ResponseEntity<List<RoomResponse>> getRooms() {
        List<RoomResponse> rooms = roomService.findAll();

        if (rooms.isEmpty()) {
            throw new RoomNotFoundException("Rooms not found or empty list");
        }
        return ResponseEntity.ok(rooms);
    }

    // GET /api/room/{id}
    @GetMapping("/{id}")
    public ResponseEntity<RoomResponse> getRoomById(@PathVariable int id) {
        RoomResponse room = roomService.findById(id);
        if (room == null) {
            throw new RoomNotFoundException("Room not found");
        }
        return ResponseEntity.ok(room);
    }

}
