package com.example.basic.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieCreateRequest {
    private int status;
    private String message;
}
