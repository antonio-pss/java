package model.model;

import model.absModel.AbsTransport;

public class Automobile extends AbsTransport {
    private String year;
    private String model;

    public Automobile(String year, String model) {
        this.year = year;
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void changeOil() {
        return;
    }


    @Override
    public void accelerate() {
        return;
    }

    @Override
    public void decelerate() {
        return;
    }
}
