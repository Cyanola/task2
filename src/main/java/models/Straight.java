package models;

import models.Shape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight extends Shape {

    public Straight(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(GraphicsContext gc) {
//Start the Path

        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);

        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        gc.lineTo(this.x*2, this.y*2);


        gc.stroke();



//// End the Path

        gc.closePath();
    }
    @Override
    void setHeight(double value) {
        height = value;
    }

    @Override
    double getHeight() {
        return height;
    }

    @Override
    void setWidth(double value) {
        width = value;
    }

    @Override
    double getWidth() {
        return width;
    }

    @Override
    public String  descriptor() {
        return "Цвет границы прямой : " + super.colorBorder;     }

}
