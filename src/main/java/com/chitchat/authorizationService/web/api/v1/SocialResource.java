package com.chitchat.authorizationService.web.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Mory Keita
 */

@RestController
@RequestMapping(path = "/social")
public class SocialResource {

    @GetMapping(path = "/user")
    public Principal user (Principal principal){
        return principal;
    }
}
