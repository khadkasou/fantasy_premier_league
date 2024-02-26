package com.swifttech.fantasy.dto;

import com.swifttech.fantasy.generic.BaseAuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest extends BaseAuditEntity<Long> {
    private String userName;
    private String password;

}
