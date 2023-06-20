package com.mycode.designpatternscreationalfactory;

import com.mycode.designpatternscreationalfactory.factory.VehicleFactory;
import com.mycode.designpatternscreationalfactory.vehicle.Vehicle;


public class FactoryDesignPattern {
    public static void main(String[] args) {

        String vehicleType = "car";
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.getVehicle(vehicleType);
        System.out.println(vehicle.getNumberOfTires());

    }
}
