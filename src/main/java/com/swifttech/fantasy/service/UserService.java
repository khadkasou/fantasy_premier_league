package com.swifttech.fantasy.service;

import com.swifttech.fantasy.dto.CreateUser;
import com.swifttech.fantasy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(CreateUser createUser);

    Optional<User> findById(Long id);

    List<User> listAllUser();

    User updateUser(Long id, CreateUser createUser);

}
