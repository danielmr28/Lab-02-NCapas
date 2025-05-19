package com.dog.unistay.dto.response;

import com.dog.unistay.entities.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
}
