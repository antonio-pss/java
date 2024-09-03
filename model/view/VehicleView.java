package model.view;

import model.controller.VehicleController;
import model.model.Vehicle;

import java.util.Scanner;

public class VehicleView {
    private final Scanner scanner = new Scanner(System.in);

    public  void menu(){
        int option;
        VehicleController vehicleController = new VehicleController();

        do {
            Vehicle vehicle = new Vehicle();
            System.out.println("\nMenu: ");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show Vehicle");
            System.out.println("0. Leave");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Vehicle Plate: ");
                    vehicle.setPlate(scanner.next()); 
                    System.out.print("Vehicle Model: ");
                    vehicle.setModel(scanner.next());
                    vehicleController.addVehicle(vehicle);
                    break;
                case 2:
                    vehicleController.listVehicles();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while (option != 0);
    }
}
