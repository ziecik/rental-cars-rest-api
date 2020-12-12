package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.model.Car;
import com.example.rentalcarsrestapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("all")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.add(car);
    }
}
