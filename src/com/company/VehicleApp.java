package com.company;

public class VehicleApp {

    public static void main(String[] args) {
        Car raceCar = new SportCar();
        raceCar.maxSpeed = 270;
        VehicleApp main = new VehicleApp();
        System.out.println(main.getTargetCustomer(raceCar));
    }
    public String getTargetCustomer(Vehicle v){
        String message = null;
        if (v.getMaxSpeed()>200){
            message = "Sportautó";
        }
        if (v.getNrOfSeats()>5){
            message = "Családos embereknek ajánlott.";
        }
        return message;
    }
}

