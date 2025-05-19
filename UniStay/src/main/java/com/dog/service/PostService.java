package com.dog.unistay.service;

import com.dog.unistay.dto.response.PostResponse;
import com.dog.unistay.entities.Post;

import java.util.List;

public interface PostService {
    List<PostResponse> findAll();
    PostResponse findById(int id);
}
