package com.geekster.Blogging.API.model.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpOutput {
    private Boolean signupStatus;
    private String signUpMessage;
}
