package com.tymoshenko.filesharing.controller;

import com.tymoshenko.filesharing.exception.UserAlreadyExistException;
import com.tymoshenko.filesharing.model.dto.UserDto;
import com.tymoshenko.filesharing.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerUser(@Valid UserDto userDto){
        if(userService.findByEmail(userDto.getEmail()) != null){
            throw new UserAlreadyExistException();
        }

        userService.save(userDto);
    }
}
