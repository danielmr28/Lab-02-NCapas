package com.dog.service.impl;

import com.dog.dto.response.PostResponse;
import com.dog.repository.PostRepository;
import com.dog.service.PostService;
import com.dog.utils.mappers.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository Repository) {

        this.postRepository = Repository;
    }

    @Override
    public List<PostResponse> findAll() {
        return PostMapper.toDTOList(postRepository.findAll());
    }

    @Override
    public PostResponse findById(int id) {
        return PostMapper.toDTO(postRepository.findById(id).get());
    }
}
