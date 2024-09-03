package model;

import inModel.InGeometryFigure;

public class Square implements InGeometryFigure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public String getNameFigure() {
        return "";
    }
}
