package com.dog.service;

import com.dog.dto.request.UserRequest;
import com.dog.dto.request.UserUpdateRequest;
import com.dog.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();
    UserResponse findById(int id);
    UserResponse save(UserRequest User);
    UserResponse update(UserUpdateRequest User);
    void delete(int id);
}
