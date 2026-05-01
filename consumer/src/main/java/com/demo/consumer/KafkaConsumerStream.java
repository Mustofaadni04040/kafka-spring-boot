package com.demo.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumerStream {
    @Bean
    public Consumer<RiderLocation> processRiderLocation() {
        return location -> {
            System.out.println("Received location: " + location.getRiderId() + " at (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        };
    }
}
