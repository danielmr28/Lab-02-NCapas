package com.dog.unistay.service;

import com.dog.unistay.dto.request.UserRequest;
import com.dog.unistay.dto.request.UserUpdateRequest;
import com.dog.unistay.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();
    UserResponse findById(int id);
    UserResponse save(UserRequest User);
    UserResponse update(UserUpdateRequest User);
    void delete(int id);
}
