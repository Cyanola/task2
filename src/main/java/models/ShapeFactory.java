package models;

import javafx.scene.paint.Color;


public class ShapeFactory {
    public Shape createShape(int numberOfSides, double x, double y, int line, Color colorborder, Color colorfill,
                             double   height, double width){
        if(numberOfSides==5){
            return new Pentagon(line, colorborder, colorfill, x, y);
        }
        else if(numberOfSides==4){
            return new Square(line, colorborder, colorfill, x, y, height, width);
        }
        else if(numberOfSides==3){
            return new Triangle(line, colorborder, colorfill, x, y);
        }
        else if(numberOfSides==2){
            return new Angle(x,y,line, colorborder, colorfill);
        }
        else if (numberOfSides==1){
            return new Straight(line, colorborder, colorfill, x, y);
        }
        else if(numberOfSides==0){
            return new Circle(line, colorborder, colorfill, x, y, height, width);
        }
        else{
            return null;
        }
    }
}