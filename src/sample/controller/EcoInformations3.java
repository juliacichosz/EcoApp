package sample.controller;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class EcoInformations3 extends AppController{

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void goToPreviousPage(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/ecoInformations2.fxml");
    }

    public void goToNextPage(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/ecoInformations4.fxml");
    }
}
