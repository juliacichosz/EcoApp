package sample.controller;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TestMenu extends AppController {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToInputQuestionsCategory(ActionEvent actionEvent) {
        getInputQuestionsCategory();
        goTo.execute(actionEvent, "../view/inputQuestionsCategory.fxml");
    }

    public void goToOneChoiceQuestionsCategory(ActionEvent actionEvent) {
        getOneChoiceSecondQuestionsCategory();
        goTo.execute(actionEvent, "../view/oneChoiceQuestionsCategory.fxml");
    }
}
