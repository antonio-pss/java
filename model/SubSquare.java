package model;

import java.awt.*;

public class SubSquare extends Rect{
    public SubSquare(float side) {
        super(side, side);
    }

    @Override
    public float calcArea() {
        return getSide()*getSide();
    }

    @Override
    public float calcPerimeter() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "SubSquare{" +
                "side="+this.getSide() +
                ", height="+this.getHeight() + "}";
    }
}
