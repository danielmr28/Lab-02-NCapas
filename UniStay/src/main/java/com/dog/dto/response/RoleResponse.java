package com.dog.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleResponse {
    private Integer roleId;
    private String roleName;

}
