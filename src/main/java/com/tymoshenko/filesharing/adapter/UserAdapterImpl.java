package com.tymoshenko.filesharing.adapter;

import com.tymoshenko.filesharing.model.dto.UserDto;
import com.tymoshenko.filesharing.model.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAdapterImpl implements UserAdapter {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserAdapterImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User convertUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        return user;
    }
}