package com.chitchat.authorizationService.web.api.v1;

import javax.validation.Valid;

import com.chitchat.authorizationService.dto.UserDto;
import com.chitchat.authorizationService.entity.User;
import com.chitchat.authorizationService.exception.ApiError;
import com.chitchat.authorizationService.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class AuthorizationResource {
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	@Autowired
	private UserService userService;


	@PreAuthorize("permitAll()")
	@PostMapping(path="/register")
	public ResponseEntity<Object> register(@RequestBody @Valid UserDto accountDto, BindingResult bindingResult){
		LOGGER.debug("Registring new Account: {}", accountDto);
		if (bindingResult.hasErrors()) {
			ApiError error = new ApiError();
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> message = new ArrayList<>();
			error.setCode(-2);
			for (FieldError e : errors){
				message.add("@" + e.getField().toUpperCase() + ":" + e.getDefaultMessage());
			}
			error.setMessage("Resgistration Failted.");
			error.setCause(message.toString());
			LOGGER.debug("Registring Failed with error: {}", error);
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}
		final User user = userService.registerUser(accountDto);

		try{
			//String apiUrl = reques
		} catch (Exception e){

		}

		return new ResponseEntity<>("sucess", HttpStatus.CREATED);
	}

	@PreAuthorize("permitAll()")
	@GetMapping(path="/hello")
	public String hello () {
		return "hello";
	}

}
