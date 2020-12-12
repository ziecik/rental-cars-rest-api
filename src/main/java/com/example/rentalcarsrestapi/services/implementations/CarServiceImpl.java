package com.example.rentalcarsrestapi.services.implementations;

import com.example.rentalcarsrestapi.model.Car;
import com.example.rentalcarsrestapi.repositories.CarRepository;
import com.example.rentalcarsrestapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car add(Car car) {
        return carRepository.save(car);
    }
}
