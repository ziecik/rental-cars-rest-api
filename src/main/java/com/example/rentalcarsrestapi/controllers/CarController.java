package com.example.rentalcarsrestapi.controllers;

import com.example.rentalcarsrestapi.dto.AddCarRequest;
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
    public Car addCar(@RequestBody AddCarRequest addCarRequest) {
        return carService.add(addCarRequest);
    }

    @GetMapping("/engineSize")
    public List<Car> findCarsByEngineSize(@RequestParam("minSize") Float minSize, @RequestParam("maxSize") Float maxSize) {
        return carService.findCarsByEngineSize(minSize, maxSize);
    }

    @GetMapping
    public List<Car> findCarsByPrice(@RequestParam("minPrice") Float minPrice, @RequestParam("maxPrice") Float maxPrice) {
        return carService.findCarsByPrice(minPrice, maxPrice);
    }
}
