package com.example.Calc.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class LoginForm {

    @NotBlank
    private String loginId;

    @NotBlank
    private String password;
}
