package model.model;

import model.absModel.AbsForm;

public class Rect extends AbsForm {
    private float side;
    private float height;

    public Rect(float side, float height) {
        this.side = side;
        this.height = height;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float calcArea() {
        return side * height;
    }

    @Override
    public float calcPerimeter() {
        return (side * 2) + (height * 2);
    }

    @Override
    public String toString() {
        return "Rect{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
