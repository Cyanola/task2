package com.example.task2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import models.Shape;
import models.ShapeFactory;

public class HelloController {
    @FXML
    public FlowPane flowpane;
    @FXML
    private TextField txtCount;
    @FXML
    private TextField widthCount;
    @FXML
    private TextField heightCount;

    @FXML
    private TextField borderCount;

    @FXML
    private ColorPicker fillPicker;
    @FXML
    private ColorPicker borderPicker;

    @FXML
    private Canvas canvas;

@FXML
private Label info;
    @FXML
    protected void onMouseClicked(MouseEvent event) {
        ShapeFactory shapeFactory = new ShapeFactory(); //get an object  and call its draw method.

        Shape shape = shapeFactory.createShape(Integer.parseInt(txtCount.getText()), event.getX(), event.getY(),Integer.parseInt(borderCount.getText()),
                borderPicker.getValue(), fillPicker.getValue(),Double.parseDouble(heightCount.getText()), Double.parseDouble(widthCount.getText()));

        GraphicsContext gc = canvas.getGraphicsContext2D(); //получить контекст(холст) для рисования

        shape.draw(gc);
        info.setText(shape.descriptor());
    }
}