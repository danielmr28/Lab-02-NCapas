package com.dog.service.impl;

import com.dog.dto.response.RoleResponse;
import com.dog.repository.RoleRepository;
import com.dog.service.RoleService;
import com.dog.utils.mappers.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository Repository) {
        this.roleRepository = Repository;
    }

    @Override
    public List<RoleResponse> findAll() {
        return RoleMapper.toDTOList(roleRepository.findAll());
    }

    @Override
    public RoleResponse findById(int id) {
        return RoleMapper.toDTO(roleRepository.findById(id).get());
    }

}
