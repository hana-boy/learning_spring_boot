package com.example.webapp.service;

import com.example.webapp.entity.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> findAllToDo();

    ToDo findByIdToDo(Integer id);

    void insertToDo(ToDo toDo);

    void updateToDo(ToDo toDo);

    void deleteToDo(Integer id);
}
