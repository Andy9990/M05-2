import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.StackPane;

import javafx.scene.Group;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.event.Event;

import javafx.event.EventHandler;

import javafx.stage.Stage;

public class color_circle extends Application

{

@Override

public void start(Stage p_Stage)

{

float w = 750;

float h = 750;

Circle C = new Circle(w/2, h/2,

Math.min(w h)/15, Color.WHITE);

C.setStroke(Color.BLACK);

StackPane Pane = new StackPane(C);

p_Stage.setScene(new Scene(Pane, w, h));

Pane.setOnMousePressed(e ->

C.setFill(Color.BLACK));

Pane.setOnMouseReleased(e ->

C.setFill(Color.WHITE));

p_Stage.setTitle("Please click on Circle");

p_Stage.show();

} // End of start() method

public static void main(String[] args)

{

Application.launch(args);}
}
