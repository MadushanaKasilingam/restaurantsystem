package com.project.restaurantsystem.repository;

import com.project.restaurantsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String Username);

}
