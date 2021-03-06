package sample.model;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/*
    PopupCongratulations class represents design pattern: OBSERVER
 */
public class PopupCongratulations implements IObserver {

    @Override
    public void update() {
        Stage popupwindow = new Stage();
        int score = User.getINSTANCE().getScore();

        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("EcoApp");

        Label label1 = new Label("Congratulations! You did great!");

        Button button1 = new Button("Close");

        button1.setOnAction(e -> popupwindow.close());

        VBox layout = new VBox(10);

        layout.getChildren().addAll(label1, button1);

        layout.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout, 300, 250);

        popupwindow.setScene(scene1);

        popupwindow.showAndWait();
    }
}