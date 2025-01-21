package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.dto.request.LoginRequestDto;
import org.example.dto.request.RegisterRequestDto;
import org.example.entity.Auth;
import org.example.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTHSERVICE)
public class AuthController {
    private final AuthService authService;

    @PostMapping(REGISTER)
    public ResponseEntity<Auth> register(@RequestBody RegisterRequestDto dto) {
        if(!dto.getPassword().equals(dto.getRepassword()))
                throw new RuntimeException("Passwords do not match");
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping(LOGIN)
    public ResponseEntity<Boolean> login(@RequestBody LoginRequestDto dto) {
        return ResponseEntity.ok(authService.login(dto));
    }
}
