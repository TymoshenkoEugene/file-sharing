package com.tymoshenko.filesharing.service;

import com.tymoshenko.filesharing.model.dto.UserDto;
import com.tymoshenko.filesharing.model.entity.User;

public interface UserService {
    User findByEmail(String email);
    User save(UserDto userDto);
}
