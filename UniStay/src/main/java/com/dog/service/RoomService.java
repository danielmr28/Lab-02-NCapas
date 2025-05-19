package com.dog.service;

import com.dog.dto.response.RoomResponse;

import java.util.List;

public interface RoomService {
    List<RoomResponse> findAll();
    RoomResponse findById(int id);
}
