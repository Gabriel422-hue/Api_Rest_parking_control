package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsAllByLicensePlateCar(String licensePlateCar);
    boolean existsAllByParkingSpotNumber(String ParkingSpotNumber);
    boolean existsAllByApartmentAndBlock(String apartment, String block);

}
