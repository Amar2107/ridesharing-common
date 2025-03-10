package com.prac.ride.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessResponse extends ApplicationResponse {

    public SuccessResponse(String message){
        super(message,"SUCCESS");
    }

}
