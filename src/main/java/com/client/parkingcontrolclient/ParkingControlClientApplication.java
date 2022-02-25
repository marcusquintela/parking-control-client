package com.client.parkingcontrolclient;

import io.swagger.client.ApiException;
import io.swagger.client.api.ParkingSpotControllerApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ParkingControlClientApplication {

    public static void main(String[] args) throws ApiException {
        SpringApplication.run(ParkingControlClientApplication.class, args);

        ParkingSpotControllerApi parkingSpotControllerApi = new ParkingSpotControllerApi();

        UUID id = UUID.fromString("e4f4283c-9d26-4f2d-9770-9aa130d8cc6e");

        Object parkingSpotByIdUsingGET = parkingSpotControllerApi.getParkingSpotByIdUsingGET(id);

        System.out.println(parkingSpotByIdUsingGET);


    }

}
