package com.swifttech.fantasy.mapper;

import com.swifttech.fantasy.dto.SignupRequest;
import com.swifttech.fantasy.dto.LoginRequest;
import com.swifttech.fantasy.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(SignupRequest createUser);

    User toEntity(LoginRequest loginRequest);

   SignupRequest toRegisterDto(User user);
   LoginRequest toLoginDto(User user);
}
