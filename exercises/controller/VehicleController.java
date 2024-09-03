package controller;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleController {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public boolean VehicleExist(String plate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlate().equals(plate)) {
                return true;
            }
        }
        return false;
    }

    public void addVehicle(Vehicle vehicle) {
        if (VehicleExist(vehicle.getPlate())) {
            System.out.println("Vehicle already exist");
        } else {
            vehicles.add(vehicle);
        }
    }

    public void listVehicles() {
        if (!vehicles.isEmpty()) {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } else {
            System.out.println("No vehicles exist");
        }
    }
}
