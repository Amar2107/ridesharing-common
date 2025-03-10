package com.prac.ride.entity.ride;

public enum RideStatus {
    REQUESTED,   // Passenger requested a ride
    ASSIGNED,    // Driver assigned to the ride
    ACCEPTED,    // Driver accepted the ride
    IN_PROGRESS, // Ride started
    COMPLETED,   // Ride finished
    CANCELED     // Ride canceled (by driver/passenger)

}
