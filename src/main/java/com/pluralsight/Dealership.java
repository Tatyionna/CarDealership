package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name, address, phone;
    public List <Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void getAllVehicles () {
        List<Vehicle> allVehicles;
    }

    public void getVehiclesByPrice (double min, double max) {
    }
    public void getVehiclesByMakeModel (String make, String model) {
    }
    public void getVehiclesByYear (double min, double max) {
    }
    public void getVehiclesByColor (String color) {

    }
    public void getVehiclesByMileage (double min, double max) {
    }
    public void getVehiclesByType (String vehicleType) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
