package com.prac.ride.entity.login;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {

    private final String email;
    private final String password;

    @JsonCreator
    public LoginRequest(@JsonProperty("email") String email, @JsonProperty("password") String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }


    public String getPassword(){
        return this.password;
    }
}
