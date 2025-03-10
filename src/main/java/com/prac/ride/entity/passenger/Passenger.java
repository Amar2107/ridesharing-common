package com.prac.ride.entity.passenger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Passenger")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Passenger {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phno;

}
