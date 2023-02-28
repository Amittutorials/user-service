package com.user.details.userservice.repository;

import com.user.details.userservice.model.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <UserEntity, Integer > {
    public List<UserEntity> findById(int id);

    public List<UserEntity> deleteById(int id);

    //List<UserEntity> save(int id);


}
