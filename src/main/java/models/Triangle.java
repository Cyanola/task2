package models;

import models.Shape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

    public Triangle(int lineBorder, Color colorBorder, Color colorFill, double x, double y) {
        super(lineBorder, colorBorder, colorFill, x, y);
    }

    @Override
    public void draw(GraphicsContext gc ) {
       //Start the Path

        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);
        gc.setFill(this.colorFill);
        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        gc.lineTo(this.x *2, this.y*2+y);

        gc.lineTo(this.x+x*2+x,this.y*2+y);


        gc.lineTo(x,y);

        gc.fill();
        gc.stroke();


//// End the Path

        gc.closePath();
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
    void setHeight(double value) {
        height = value;
    }

    @Override
    double getHeight() {
        return height;
    }

    @Override
    public String descriptor() {
        return "Цвет заливки треугольника " + super.colorFill +  "а границы : " + super.colorBorder;     }

}
