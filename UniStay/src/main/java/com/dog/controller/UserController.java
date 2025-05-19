package com.dog.controller;

import com.dog.dto.request.UserRequest;
import com.dog.dto.request.UserUpdateRequest;
import com.dog.dto.response.UserResponse;
import com.dog.exception.UserNotFoundException;
import com.dog.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET /api/user
    @GetMapping()
    public ResponseEntity<List<UserResponse>> getUser() {
        List<UserResponse> users = userService.findAll();

        if (users.isEmpty()) {
            throw new UserNotFoundException("Users not found or empty list");
        }
        return ResponseEntity.ok(users);
    }

    // GET /api/user/{id}
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable int id) {
        UserResponse user = userService.findById(id);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return ResponseEntity.ok(user);
    }

    // POST /
    @PostMapping("/")
    public ResponseEntity<UserResponse> saveUser(@RequestBody @Valid UserRequest user) {
        if (user == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(userService.save(user));
    }

    // PUT /
    @PutMapping("/")
    public ResponseEntity<UserResponse> updateUser(@RequestBody UserUpdateRequest user) {
        UserResponse updateUser = userService.findById(user.getUserId());
       if (updateUser == null) {
           throw new UserNotFoundException("User not found");
       }
       return ResponseEntity.ok(updateUser);
    }

    // DELETE /{id}
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.delete(id);
    }
}
