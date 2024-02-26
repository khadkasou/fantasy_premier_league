package com.swifttech.fantasy.service;

import com.swifttech.fantasy.dto.SignupRequest;
import com.swifttech.fantasy.model.User;

import java.util.List;

public interface UserService {

    SignupRequest registerUser(SignupRequest signupRequest);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    public User findUserByUsername(String username);
    User findUserDetails();

    public User findUserByUserNameAndPassword(String userName,String password);

    public User findUserByUserName(String username);
    public List<User> getAllUser();

}
