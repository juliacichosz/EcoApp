package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class EndOfTest extends AppController {
    public Button questionsSummary;
    public Label score;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayScore();
    }

    public void displayScore() {
        score.setText("You got " + User.getINSTANCE().getScore() + " points!");
    }

    public void goToQuestionsSummary(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/questionsSummary.fxml");
    }
}
