package com.swifttech.fantasy.dto;

import com.swifttech.fantasy.generic.BaseAuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest extends BaseAuditEntity<Long> {


    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private String userName;
    private String password;
    private String confirmPassword;
    private String email;
    private String gender;

}
