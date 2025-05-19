package com.dog.service;

import com.dog.dto.response.RoleResponse;

import java.util.List;

public interface RoleService {
    List<RoleResponse> findAll();
    RoleResponse findById(int id);
}
