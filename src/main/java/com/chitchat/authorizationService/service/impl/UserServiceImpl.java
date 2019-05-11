package com.chitchat.authorizationService.service.impl;

import com.chitchat.authorizationService.dto.UserDto;
import com.chitchat.authorizationService.entity.Role;
import com.chitchat.authorizationService.entity.User;
import com.chitchat.authorizationService.exception.AccountAlreadyExistsException;
import com.chitchat.authorizationService.exception.ApiError;
import com.chitchat.authorizationService.exception.HibernateException;
import com.chitchat.authorizationService.exception.UsernameAlreadyExist;
import com.chitchat.authorizationService.repository.RoleRepository;
import com.chitchat.authorizationService.repository.UserRepository;
import com.chitchat.authorizationService.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

/**
 * @author Mory Keita
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final String USER_ROLE = "role_user";

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User registerUser(UserDto accountDto) throws AccountAlreadyExistsException {
        if(doesEmailExist(accountDto.getEmail())){
            throw new AccountAlreadyExistsException("There is an account with email address: " + accountDto.getEmail());
        }
        if(doesUsernameExist(accountDto.getUsername())){
            throw new UsernameAlreadyExist("There sis an account with username : " + accountDto.getUsername());
        }
        Role role = null;
        try {
            ModelMapper mapper = new ModelMapper();
            final  User newUser = mapper.map(accountDto,User.class);
             role = roleRepository.findByName(USER_ROLE);
        } catch (Exception e){
            throw new HibernateException(e);
        }
       final  User newUser = new User();
        newUser.setRoles(Arrays.asList(role));
        return userRepository.save(newUser);
    }

    private boolean doesEmailExist(String email){
        return userRepository.findByEmail(email) != null;
    }

    private boolean doesUsernameExist ( String username){
        return userRepository.findByUsername(username) != null;
    }
}
