package com.example.democurdpractice.dto;

import com.example.democurdpractice.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDtoResponse {
    private Integer id;
    private String name;
    private Integer roles;


    public UserDtoResponse(User user) {
        this.id= user.getId();
        this.name= user.getName();
        this.roles= user.getRoles();
    }

}
