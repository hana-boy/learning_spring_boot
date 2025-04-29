package com.example.webapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    private Integer id;
    private String todo;
    private String detail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
