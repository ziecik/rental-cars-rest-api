package com.example.rentalcarsrestapi.model;

import com.example.rentalcarsrestapi.model.audit.UserDateAudit;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Car extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    private String brand;
    private String name;
    private String registrationNumber;
    @Enumerated
    private FuelType fuelType;
    private Float engineSize;
    @Enumerated
    private GearBoxType gearBoxType;
    private Integer numberOfGears;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    private Integer numberOfAirbags;
    @Enumerated
    private BodyType bodyType;
    private FuelConsumption fuelConsumption;
    private Float acceleration100;
    private Integer power;
    private Float price;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Float engineSize) {
        this.engineSize = engineSize;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public Integer getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(Integer numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfAirbags() {
        return numberOfAirbags;
    }

    public void setNumberOfAirbags(Integer numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public FuelConsumption getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(FuelConsumption fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Float getAcceleration100() {
        return acceleration100;
    }

    public void setAcceleration100(Float acceleration100) {
        this.acceleration100 = acceleration100;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    private class FuelConsumption {
        private Float lPer100kmCityDriving;
        private Float lPer100kmRoadDriving;
        private Float lPer100kmAverage;

        public Float getlPer100kmCityDriving() {
            return lPer100kmCityDriving;
        }

        public void setlPer100kmCityDriving(Float lPer100kmCityDriving) {
            this.lPer100kmCityDriving = lPer100kmCityDriving;
        }

        public Float getlPer100kmRoadDriving() {
            return lPer100kmRoadDriving;
        }

        public void setlPer100kmRoadDriving(Float lPer100kmRoadDriving) {
            this.lPer100kmRoadDriving = lPer100kmRoadDriving;
        }

        public Float getlPer100kmAverage() {
            return lPer100kmAverage;
        }

        public void setlPer100kmAverage(Float lPer100kmAverage) {
            this.lPer100kmAverage = lPer100kmAverage;
        }
    }
}
