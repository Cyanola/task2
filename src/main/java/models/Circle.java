package models;


import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    public Circle(int lineBorder, Color colorBorder, Color colorFill, double x, double y, double height, double width) {
        super(lineBorder, colorBorder, colorFill, x, y);
        this.height=height;
        this.width=width;
    }

    @Override
    void setHeight(double value) {
        super.height = value;
    }

    @Override
    double getHeight() {
        return super.height;
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
    public void draw(GraphicsContext gr) {

        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeOval(this.x - (height/2), this.y - (super.width/2), height, super.width);
        gr.setFill(colorFill);
        gr.fillOval(this.x - (height/2), this.y - (super.width/2), height, super.width);
    }

@Override
  public  String descriptor() {
        return "Цвет заливки круга " + super.colorFill +  "а границы : " + super.colorBorder;     }
    }
