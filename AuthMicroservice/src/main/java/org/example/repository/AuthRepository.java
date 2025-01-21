package org.example.repository;

import org.example.entity.Auth;

public interface AuthRepository extends MyGenericRepo<Auth, Long> {
    Boolean existsByUserNameAndPassword(String userName, String password);
}
