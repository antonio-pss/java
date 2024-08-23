package model;

public class Vehicle {
    private String plate;
    private String model;

    public Vehicle(String plate, String model) {
        this.plate = plate;
        this.model = model;
    }

    public Vehicle() {}

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return String.format("Plate: %s, Model: %s", plate, model);
    }
}
