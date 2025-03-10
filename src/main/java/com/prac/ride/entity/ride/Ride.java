package com.prac.ride.entity.ride;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Ride {

    private Long id;

    private Long passengerId;

    private Long driverId;

    private String pickupLocation;

    private String dropOffLocation;

    private RideStatus status; // Enum for tracking ride status

    private LocalDateTime requestTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
