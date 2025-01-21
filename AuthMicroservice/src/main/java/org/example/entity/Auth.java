package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_auth")
@Data
@Entity
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;
    String email;
    Boolean isActive;
    Long createAt;
}
