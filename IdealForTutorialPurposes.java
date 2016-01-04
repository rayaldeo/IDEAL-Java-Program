
/*
*This youtube site could be helpful :)
*https://www.youtube.com/watch?v=HFAsMWkiLvg
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.scene.control.Label;

/**
 * Created by jelliott on 9/17/2015.
 */
public class IdealForTutorialPurposes extends Application{
    private Button startButton,loadCharacterButton,exitButton;
    private Human human;
    private Jobs job;
    private NameGenerator name;
    private Neighborhood neighborhood;

    /*
        For Tutorial purposes

     */
    private Stage window;

    private Scene sceneOne,sceneTwo;

    public static void main (String args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        Label labelOne = new Label("WELCOME");
        Button buttonOne = new Button("Take me to scene Two");
        //This expression "e->" is a new way of handling events
        //Instead of making the whole class implement the EventHandler
        //Or making the method implement the entire c of EventHandler


        buttonOne.setOnAction(e -> window.setScene(sceneTwo));

        //Layout One- children are laid out in vertical column
        VBox layoutOne=new VBox(20);

        layoutOne.getChildren().addAll(buttonOne,labelOne);
        sceneOne =new  Scene(layoutOne,200,200);



        //ButtonTwo

        /*Button buttonTwo = new Button("Take me to scene One");
        buttonTwo.setOnAction(event ->  window.setScene(sceneOne));


        //Layout 2
        StackPane layoutTwo = new StackPane();
        layoutTwo.getChildren().add(buttonTwo);
        sceneTwo = new Scene(layoutTwo,600,600);

        window.setScene(sceneOne);
        window.setTitle("Happy Feet");
        window.show();*/

        primaryStage.setTitle("IDEAL");
        startButton= new Button();
        startButton.setText("Start");

        loadCharacterButton= new Button();
        loadCharacterButton.setText("Load Character");

        exitButton= new Button();
        exitButton.setText("Exit");




        //Lambda java:1.8
        startButton.setOnAction(e -> Alert.display("Title of Window", "Alert"));
        loadCharacterButton.setOnAction(event1 -> Alert.display("Welcome","Welcome"));
        exitButton.setOnAction(event -> window.close());

        StackPane layout = new StackPane();
        layout.getChildren().add(startButton);
        //layout.getChildren().add(loadCharacterButton);
        //layout.getChildren().add(exitButton);
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();



    }


}

