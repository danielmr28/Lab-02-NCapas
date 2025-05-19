package com.dog.utils.mappers;

import com.dog.dto.response.RoleResponse;
import com.dog.entities.Role;

import java.util.List;

public class RoleMapper {

   public static Role toEntity(RoleResponse roleResponse) {
      return Role.builder()
              .id(roleResponse.getRoleId())
              .role(roleResponse.getRoleName())
              .build();
   }

    public static RoleResponse toDTO(Role role) {
        return RoleResponse.builder()
                .roleId(role.getId())
                .roleName(role.getRole())
                .build();
    }

    public static List<RoleResponse> toDTOList(List<Role> roles) {
        return roles.stream()
                .map(RoleMapper::toDTO)
                .toList();
    }

}
