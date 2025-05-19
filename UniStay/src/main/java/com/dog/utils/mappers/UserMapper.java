package com.dog.utils.mappers;

import com.dog.dto.request.UserRequest;
import com.dog.dto.request.UserUpdateRequest;
import com.dog.dto.response.UserResponse;
import com.dog.entities.User;

import java.util.List;

public class UserMapper {

    // This class is used to convert between User entity and User DTO
    public static User toEntity(UserResponse userResponse) {
        return User.builder()
                .id(userResponse.getUserId())
                .name(userResponse.getFirstName())
                .lastName(userResponse.getLastName())
                .email(userResponse.getEmail())
                .role(userResponse.getRole())
                .build();
    }

    // This method is used to convert UserRequest DTO to User entity
    public static User toEntityCreate(UserRequest userDTO) {
        return User.builder()
                .name(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .email(userDTO.getEmail())
                .build();
    }

    // This method is used to convert UserResponse DTO to User entity for update
    public static User toEntityUpdate(UserUpdateRequest userDTO) {
        return User.builder()
                .id(userDTO.getUserId())
                .name(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .email(userDTO.getEmail())
                .build();
    }

    // This method is used to convert User entity to UserResponse DTO
    public static UserResponse toDTO(User user) {
        return UserResponse.builder()
                .userId(user.getId())
                .firstName(user.getName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }

    // This method is used to convert a list of User entities to a list of UserResponse DTOs
    public static List<UserResponse> toDTOList(List<User> users) {
        return users.stream()
                .map(UserMapper::toDTO)
                .toList();
    }
}
