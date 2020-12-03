package com.example.cltest.demo_crud.repository;

import com.example.cltest.demo_crud.model.User;

import java.util.List;

public interface UserRepository {
    int save(User user);
    int update(User user);
    int delete(long id);
    List<User> findALL();
    User findById(long id);
}
