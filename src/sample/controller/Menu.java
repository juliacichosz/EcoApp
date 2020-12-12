package sample.controller;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Menu extends AppController {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToTest(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/testMenu.fxml");
    }

    public void goToInformationsMenu(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/informationsMenu.fxml");
    }
}
