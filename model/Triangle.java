package model;

import inModel.InGeometryFigure;

public class Triangle implements InGeometryFigure {
    public int base;
    public int height;
    public int sideA;
    public int sideB;
    public int sideC;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public String getNameFigure() {
        return "Triangle";
    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }
}
