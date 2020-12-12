package com.example.rentalcarsrestapi.model;

import com.example.rentalcarsrestapi.model.audit.UserDateAudit;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
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

    private Float acceleration100;
    private Integer power;
    private Float price;

    private Date nextTechnicalTest;
    private Date endOfInsurance;
    @Enumerated
    private CarStatus carStatus;


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

    public Date getNextTechnicalTest() {
        return nextTechnicalTest;
    }

    public void setNextTechnicalTest(Date nextTechnicalTest) {
        this.nextTechnicalTest = nextTechnicalTest;
    }

    public Date getEndOfInsurance() {
        return endOfInsurance;
    }

    public void setEndOfInsurance(Date endOfInsurance) {
        this.endOfInsurance = endOfInsurance;
    }

}
