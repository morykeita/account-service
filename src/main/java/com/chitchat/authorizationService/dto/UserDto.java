package com.chitchat.authorizationService.dto;

import com.chitchat.authorizationService.annotation.ValidEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Mory Keita
 */
public class UserDto {

    @NotNull(message = "username can't not be null")
    @NotBlank
    @Size(min = 3,max = 25, message = "Username must be between 3 and 25 characters.")
    private String username;
    @NotNull @NotBlank
    private String password;
    @ValidEmail @NotNull @NotEmpty @NotBlank
    private String email;

    private String country;
    private String user_type;
    private String mobile;
    private boolean is_tfa_Enabled;
    private String tfa_default_type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isIs_tfa_Enabled() {
        return is_tfa_Enabled;
    }

    public void setIs_tfa_Enabled(boolean is_tfa_Enabled) {
        this.is_tfa_Enabled = is_tfa_Enabled;
    }

    public String getTfa_default_type() {
        return tfa_default_type;
    }

    public void setTfa_default_type(String tfa_default_type) {
        this.tfa_default_type = tfa_default_type;
    }
}
