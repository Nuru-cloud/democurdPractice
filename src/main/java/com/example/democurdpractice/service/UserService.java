package com.example.democurdpractice.service;

import com.example.democurdpractice.dto.UserDtoRequest;
import com.example.democurdpractice.dto.UserDtoResponse;
import com.example.democurdpractice.model.User;

import java.util.List;

public interface UserService {
    UserDtoResponse saveUser(UserDtoRequest userDtoRequest);
    List<User> getAll();
    User showById(Integer id);
    void deleteByName(String name);
    void deleteUserById(Integer id);

    UserDtoResponse updateUser(UserDtoRequest userDtoRequest);
}
