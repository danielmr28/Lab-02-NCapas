package com.dog.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserUpdateRequest {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
}
