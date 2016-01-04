/**
 * Created by jelliott on 9/20/2015.
 */

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Alert {
    public static void display(String title,String message){
        Stage window = new Stage();

        //This function stops users from focusing on anything but the current alert window
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Alert");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(event -> window.close());

        VBox layout= new VBox();

        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);

        //
        //javafx.stage.Stage
        //public void showAndWait()
        //Shows this stage and waits for it to be hidden (closed) before returning to the caller.
        //This method temporarily blocks processing of the current event,
        //and starts a nested event loop to handle other events.
        //This method must be called on the FX Application thread.
        //
        //
        window.showAndWait();

    }
}
