package com.mycode.designpatternscreationalfactory.factory;

import com.mycode.designpatternscreationalfactory.vehicle.Car;
import com.mycode.designpatternscreationalfactory.vehicle.Motorcycle;
import com.mycode.designpatternscreationalfactory.vehicle.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "car":
                return new Car();
            case "motorcycle":
                return new Motorcycle();
            default:
                return null;
        }
    }

}
