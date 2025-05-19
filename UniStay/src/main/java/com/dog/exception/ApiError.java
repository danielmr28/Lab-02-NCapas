package com.dog.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiError {
    private String message;
    private int status;
    private long timestamp;
}
