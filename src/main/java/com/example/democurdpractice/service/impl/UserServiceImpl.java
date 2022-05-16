package com.example.democurdpractice.service.impl;

import com.example.democurdpractice.dto.UserDtoRequest;
import com.example.democurdpractice.dto.UserDtoResponse;
import com.example.democurdpractice.model.User;
import com.example.democurdpractice.repo.UserRepo;
import com.example.democurdpractice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private  final UserRepo userRepo;

    @Override
    public UserDtoResponse saveUser(UserDtoRequest userDtoRequest) {
        User userobj=new User();
        userobj.setId(userDtoRequest.getId());
        userobj.setName(userDtoRequest.getName());
        userobj.setRoles(userDtoRequest.getRoles());
        userRepo.save(userobj);
        return new UserDtoResponse(userobj);
    }
    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
    @Override
    public UserDtoResponse updateUser(UserDtoRequest userDtoRequest) {
        Optional<User> optionalUser=userRepo.findById(userDtoRequest.getId());
        if(optionalUser.isPresent()){
            User user=new User();
            user.setId(userDtoRequest.getId());
            user.setName(userDtoRequest.getName());
            user.setRoles(userDtoRequest.getRoles());
            userRepo.save(user);
            return new UserDtoResponse(user);
        }
        throw new NullPointerException("null");
    }
    @Override
    public User showById(Integer id) {
        return userRepo.getById(id);
    }
    @Override
    public void deleteByName(String name) {
        userRepo.deleteByName(name);
    }
    @Override
    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }
}
