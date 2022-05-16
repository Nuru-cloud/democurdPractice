package com.example.democurdpractice.controller;

import com.example.democurdpractice.dto.UserDtoRequest;
import com.example.democurdpractice.dto.UserDtoResponse;
import com.example.democurdpractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/")
public class UserController {
  private final UserService userService;
    @PostMapping("/save")
    public UserDtoResponse saveUser(@RequestBody UserDtoRequest userDtoRequest){
        return userService.saveUser(userDtoRequest);
    }
    @PutMapping("/update")
    public UserDtoResponse updateUser(@RequestBody UserDtoRequest userDtoRequest){
        return userService.updateUser(userDtoRequest);
    }
    @DeleteMapping("/deleteByName")
    public void deleteByName(String name){
        userService.deleteByName(name);
    }
    @DeleteMapping("/deleteById")
    public void deleteById(Integer id){
        userService.deleteUserById(id);

    }

}
