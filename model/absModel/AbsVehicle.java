package model.absModel;

public class AbsVehicle {
    private String plate;
    private int fuelIn;
    private int mileage;
    private boolean rented;
    private Double dailyPrice;

    public void supply(int fuel) {}

    public boolean travel(int distance) {
        return true;
    }

    @Override
    public String toString() {
        return "AbsVehicle{" +
                "plate='" + plate + '\'' +
                ", fuelIn=" + fuelIn +
                ", mileage=" + mileage +
                ", rented=" + rented +
                ", dailyPrice=" + dailyPrice +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
