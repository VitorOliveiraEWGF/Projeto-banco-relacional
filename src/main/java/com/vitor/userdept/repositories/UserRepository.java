package com.vitor.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}