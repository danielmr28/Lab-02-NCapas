package com.dog.utils.mappers;

import com.dog.dto.response.RoomResponse;
import com.dog.entities.Room;
import java.util.List;

public class RoomMapper {

    public static Room toEntity(RoomResponse roomResponse) {
        return Room.builder()
                .id(roomResponse.getRoomId())
                .description(roomResponse.getDescription())
                .address(roomResponse.getAddress())
                .available(roomResponse.isAvailable())
                .user(UserMapper.toEntity(roomResponse.getUser()))
                .build();
    }

    public static RoomResponse toDTO(Room room) {
        return RoomResponse.builder()
                .roomId(room.getId())
                .description(room.getDescription())
                .address(room.getAddress())
                .available(room.isAvailable())
                .user(UserMapper.toDTO(room.getUser()))
                .build();
    }

    public static List<RoomResponse> toDTOList(List<Room> rooms) {
        return rooms.stream()
                .map(RoomMapper::toDTO)
                .toList();
    }

}
