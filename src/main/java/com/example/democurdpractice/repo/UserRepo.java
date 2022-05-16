package com.example.democurdpractice.repo;

import com.example.democurdpractice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    void deleteByName(String name);
}
