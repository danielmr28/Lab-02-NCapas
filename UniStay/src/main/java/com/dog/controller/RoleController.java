package com.dog.controller;

import com.dog.dto.response.RoleResponse;
import com.dog.exception.RoleNotFoundException;
import com.dog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping()
    public ResponseEntity<List<RoleResponse>> getRoles() {
        List<RoleResponse> roles = roleService.findAll();
        if (roles.isEmpty()) {
            throw new RoleNotFoundException("Role not found or empty list");
        }
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleResponse> getRoleById(@PathVariable int id) {
        RoleResponse role = roleService.findById(id);
        if (role == null) {
            throw new RoleNotFoundException("Role not found");
        }
        return ResponseEntity.ok(role);
    }

}
