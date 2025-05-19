package com.dog.service.impl;

import com.dog.dto.response.RoomResponse;
import com.dog.repository.RoomRepository;
import com.dog.service.RoomService;
import com.dog.utils.mappers.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository repository) {
        this.roomRepository = repository;
    }

    @Override
    public List<RoomResponse> findAll() {
        return RoomMapper.toDTOList(roomRepository.findAll());
    }

    @Override
    public RoomResponse findById(int id) {
        return RoomMapper.toDTO(roomRepository.findById(id).get());
    }

}
