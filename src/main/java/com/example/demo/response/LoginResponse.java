package com.example.demo.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String jwtToken;

    private Long userId;

    public LoginResponse(String jwtToken, Long userId) {
        this.jwtToken = jwtToken;
        this.userId = userId;
    }
}
