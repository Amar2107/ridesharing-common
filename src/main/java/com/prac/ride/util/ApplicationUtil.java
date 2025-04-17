package com.prac.ride.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ApplicationUtil {

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getCurrentFormattedTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm:dd:MM:yyyy");
        return LocalDateTime.now().format(formatter);
    }

}
