package com.example.rentalcarsrestapi.repositories;

import com.example.rentalcarsrestapi.model.Car;
import com.example.rentalcarsrestapi.model.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByPriceBetween(Float price1, Float price2);
    List<Car> findByEngineSizeBetween(Float sizeMin, Float sizeMax);
    List<Car> findByFuelType(FuelType fuelType);
}
