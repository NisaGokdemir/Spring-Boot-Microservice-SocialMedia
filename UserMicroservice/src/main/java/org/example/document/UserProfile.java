package org.example.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfile {
    @Id
    String id;

    Long authId;
    String name;
    String userName;
    String surName;
    String email;
    String phone;
    String avatar;
    String insta;
    String twitter;
    Boolean isActive;
    Long createAt;
}
