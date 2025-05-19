package com.dog.unistay.service.impl;

import com.dog.unistay.dto.request.UserRequest;
import com.dog.unistay.dto.request.UserUpdateRequest;
import com.dog.unistay.dto.response.UserResponse;
import com.dog.unistay.repository.UserRepository;
import com.dog.unistay.service.UserService;
import com.dog.unistay.utils.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.userRepository = repository;
    }

   @Override
    public List<UserResponse> findAll() {
        return UserMapper.toDTOList(userRepository.findAll());
    }

    @Override
    public UserResponse findById(int id) {
        return UserMapper.toDTO(userRepository.findById(id).get());
    }

    @Override
    public UserResponse save(UserRequest User) {
        return UserMapper.toDTO(userRepository.save(UserMapper.toEntityCreate(User)));
    }

    @Override
    public UserResponse update(UserUpdateRequest User) {
        return UserMapper.toDTO(userRepository.save(UserMapper.toEntityUpdate(User)));
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

}
