package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.document.UserProfile;
import org.example.dto.CreateUserRequestDto;
import org.example.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.example.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
        userProfileService.createUser(dto);
        return ResponseEntity.ok( true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll(){
        return ResponseEntity.ok(userProfileService.getAll());
    }
}
