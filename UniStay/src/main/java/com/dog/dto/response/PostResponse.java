package com.dog.unistay.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostResponse {
    private int postId;
    private String title;
    private double price;
    private String image;
    private String status;
    private UserResponse user;
    private RoomResponse room;
}
