package com.tymoshenko.filesharing.service;

import com.tymoshenko.filesharing.adapter.UserAdapter;
import com.tymoshenko.filesharing.model.dto.UserDto;
import com.tymoshenko.filesharing.model.entity.User;
import com.tymoshenko.filesharing.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserAdapter userAdapter;

    public UserServiceImpl(UserRepository userRepository, UserAdapter userAdapter) {
        this.userRepository = userRepository;
        this.userAdapter = userAdapter;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);

    }

    @Override
    public User save(UserDto userDto) {
        User user = userAdapter.convertUserDtoToUser(userDto);
        return userRepository.save(user);
    }
}
