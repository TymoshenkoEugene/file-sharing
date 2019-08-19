package com.tymoshenko.filesharing.adapter;

import com.tymoshenko.filesharing.model.dto.UserDto;
import com.tymoshenko.filesharing.model.entity.User;

public interface UserAdapter {
    User convertUserDtoToUser(UserDto userDto);
}
