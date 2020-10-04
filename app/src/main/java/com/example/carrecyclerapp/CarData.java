package com.example.carrecyclerapp;

public class CarData {
    private String carName;
    private String carDescription;
    private int carImage;
    private String carInformation;

    public CarData(String carName, String carDescription, int carImage, String carInformation) {
        this.carName = carName;
        this.carDescription = carDescription;
        this.carImage = carImage;
        this.carInformation = carInformation;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public int getCarImage() {
        return carImage;
    }

    public String getCarInformation()
    {
        return carInformation;
    }
}
