package com.swifttech.fantasy.service;

import com.swifttech.fantasy.dto.CreateUser;
import com.swifttech.fantasy.model.User;
import com.swifttech.fantasy.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServerImpl implements UserService{

    private final UserRepo userRepo;

    @Override
    public User create(CreateUser createUser) {

        User user= new User();
        user.setFirstName(createUser.getFirstName());
        user.setMiddleName(createUser.getMiddleName());
        user.setLastName(createUser.getLastName());
        user.setAddress(createUser.getAddress());
        user.setDateOfBirth(createUser.getDateOfBirth());
        user.setPhoneNumber(createUser.getPhoneNumber());
        user.setEmail(createUser.getEmail());
        user.setGender(createUser.getGender());
        user.setUserName(createUser.getUserName());
        user.setPassword(createUser.getPassword());
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> listAllUser() {
        return null;
    }

    @Override
    public User updateUser(Long id, CreateUser createUser) {
        return null;
    }
}
