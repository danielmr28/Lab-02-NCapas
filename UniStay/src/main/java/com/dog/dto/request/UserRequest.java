package com.dog.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid with @")
    private String email;
}
