package com.tymoshenko.filesharing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "User is already exist")
public class UserAlreadyExistException extends ApiException {
}
