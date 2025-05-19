package com.dog.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomResponse {
    private int roomId;
    private String description;
    private String address;
    private boolean available;
    private UserResponse user;
}
