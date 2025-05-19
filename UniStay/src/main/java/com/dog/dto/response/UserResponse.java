package com.dog.dto.response;

import com.dog.entities.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private RoleResponse role;
}
