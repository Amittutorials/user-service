package com.user.details.userservice.repository;

import com.user.details.userservice.model.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Integer > {

}
