package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.request.CreateUserRequestDto;
import org.example.dto.request.LoginRequestDto;
import org.example.dto.request.RegisterRequestDto;
import org.example.entity.Auth;
import org.example.manager.UserProfileManager;
import org.example.repository.AuthRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;
    private final UserProfileManager userProfileManager;

    public Auth register(RegisterRequestDto dto) {
        Auth auth = authRepository.save(Auth.builder()
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build());
        userProfileManager.createUser(CreateUserRequestDto.builder()
                .authId(auth.getId())
                .email(auth.getEmail())
                .userName(auth.getUserName())
                .build());
        return auth;
    }

    public Boolean login(LoginRequestDto dto) {
        return authRepository.existsByUserNameAndPassword(dto.getUserName(),dto.getPassword());
    }
}
