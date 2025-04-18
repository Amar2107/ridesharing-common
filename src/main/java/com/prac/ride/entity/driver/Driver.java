package com.prac.ride.entity.driver;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "Driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    @Id
    private Long id;
    @NotBlank(message = "Driver name cannot be null")
    private String name;
    @NotBlank(message = "Email cannot be left blank")
    private String email;
    @NotBlank(message = "Password cannnot be left blank")
    private String password;
    private String phno;
    private String vehicleModel;
    @NotBlank(message = "Vehicle number cannot be left blank")
    private String vehicleNumber;

    private Double latitude;  // Current location (updated periodically)
    private Double longitude;
    private LocalDateTime lastUpdated;

}
