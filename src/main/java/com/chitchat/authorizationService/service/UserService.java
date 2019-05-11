package com.chitchat.authorizationService.service;

import com.chitchat.authorizationService.dto.UserDto;
import com.chitchat.authorizationService.entity.User;
import com.chitchat.authorizationService.exception.AccountAlreadyExistsException;
import org.springframework.stereotype.Service;

/**
 * @author Mory Keita
 */

public interface UserService {

    User registerUser(UserDto accountDto) throws AccountAlreadyExistsException;
}
