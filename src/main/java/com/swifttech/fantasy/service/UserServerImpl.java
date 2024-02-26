package com.swifttech.fantasy.service;

import com.swifttech.fantasy.dto.SignupRequest;
import com.swifttech.fantasy.mapper.UserMapper;
import com.swifttech.fantasy.model.User;
import com.swifttech.fantasy.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServerImpl implements UserService{

    private final UserRepo userRepo;

    @Override
    public SignupRequest registerUser(SignupRequest signupRequest) {
        User user= UserMapper.INSTANCE.toEntity(signupRequest);
         this.userRepo.save(user);
         return UserMapper.INSTANCE.toRegisterDto(user);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return null;
    }

    @Override
    public Boolean existsByEmail(String email) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public User findUserDetails() {
        return null;
    }

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
        return null;
    }

    @Override
    public User findUserByUserName(String username) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}
