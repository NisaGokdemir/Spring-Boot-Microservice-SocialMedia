package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.document.UserProfile;
import org.example.dto.CreateUserRequestDto;
import org.example.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public void createUser(CreateUserRequestDto dto) {
        userProfileRepository.save(UserProfile.builder()
                        .authId(dto.getAuthId())
                        .userName(dto.getUserName())
                        .email(dto.getEmail())
                .build());
    }

    public List<UserProfile> getAll() {
        return userProfileRepository.findAll();
    }
}
