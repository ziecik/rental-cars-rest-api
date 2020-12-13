package com.example.rentalcarsrestapi.services;

import com.example.rentalcarsrestapi.dto.AddCarRequest;
import com.example.rentalcarsrestapi.model.Car;

import java.util.*;

public interface CarService {
    List<Car> getAllCars();
    Car add(AddCarRequest addCarRequest);
    Car add(Car car);
}
