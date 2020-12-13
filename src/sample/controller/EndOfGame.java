package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import sample.controller.AppController;

import java.net.URL;
import java.util.ResourceBundle;

public class EndOfGame extends AppController {
    public Button menu;
    public Button finish;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void goToMenu(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/menu.fxml");
    }

    public void finishTheGame(ActionEvent actionEvent) {
        System.exit(0);
    }
}
