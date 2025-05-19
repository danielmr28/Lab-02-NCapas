package com.dog.controller;

import com.dog.dto.response.PostResponse;
import com.dog.exception.PostNotFoundException;
import com.dog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    // GET /api/post
    @GetMapping()
    public ResponseEntity<List<PostResponse>> getPosts() {
        List<PostResponse> posts = postService.findAll();

        if (posts.isEmpty()) {
            throw new PostNotFoundException("Post not found or empty list");
        }
        return ResponseEntity.ok(posts);
    }

    // GET /api/post/{id}
    @GetMapping("/{id}")
    public ResponseEntity<PostResponse> getPostById(@PathVariable int id) {
        PostResponse post = postService.findById(id);
        if (post == null) {
            throw new PostNotFoundException("Post not found");
        }
        return ResponseEntity.ok(post);
    }

}
