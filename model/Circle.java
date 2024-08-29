package model;

import absModel.AbsForm;

public class Circle extends AbsForm {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float calcArea() {
        return 3.14f * (radius * radius);
    }

    @Override
    public float calcPerimeter() {
        return 2*3.14f*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
