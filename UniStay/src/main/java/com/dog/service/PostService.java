package com.dog.service;

import com.dog.dto.response.PostResponse;

import java.util.List;

public interface PostService {
    List<PostResponse> findAll();
    PostResponse findById(int id);
}
