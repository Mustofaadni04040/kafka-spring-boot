package com.demo.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        return () -> {
            RiderLocation location = new RiderLocation("rider 123", 20.1, 120.12);
            System.out.println("Sending location: " + location.getRiderId() + " at (" + location.getLatitude() + ", " + location.getLongitude() + ")");
            return location;
        };
    }

}
