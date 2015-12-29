
/**
 * Created by jelliott on 9/22/2015.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.*;
import javax.xml.soap.Text;

import javafx.scene.control.Label;
public class Menu extends Application {

    Stage window;
    StackPane layout;
    Button startButton,loadButton,exitButton;
    Label label;





    public static void main (String[] args){
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {



        window = primaryStage;
        window.setTitle("Ideal");
        startButton = new Button("Start");
        startButton.setOnAction(e -> Alert.display("Title of Window", "Alert"));
        label = new Label("Ideal");


        layout = new StackPane();
        layout.getChildren().addAll(startButton);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();
    }





}



