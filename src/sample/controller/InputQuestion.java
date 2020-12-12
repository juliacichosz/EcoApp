package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class InputQuestion extends AppController {
    public TextField input;
    public Label alert;
    public Label question;
    private QuestionWithInput currentQuestion;
    private final IIterator iterator = questions.createIterator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateQuestion();
        displayQuestion();
    }

    public void displayQuestion() {
        cleanUnnecessaryFields();
        question.setText(currentQuestion.getContent());
    }

    public void cleanUnnecessaryFields() {
        alert.setText("");
        input.setText("");
    }

    private void updateQuestion() {
        currentQuestion = (QuestionWithInput) iterator.getNetx();
    }

    public void answerQuestion() {
        if(anyInput()) {
            if (currentQuestion.state instanceof NonAnsweredState) {
                currentQuestion.clickAnswer(alert);
                setSelectedAnswer();
                checkAnswer();
            } else if(currentQuestion.state instanceof AnsweredState) {
                currentQuestion.clickAnswer(alert);
            }
        } else {
            alert.setText("You didn't answer.");
        }
    }

    private void setSelectedAnswer() {
        currentQuestion.userAnswer = input.getText();
    }

    private void checkAnswer() {
        if(currentQuestion.userAnswer.equals(currentQuestion.correctAnswer)) {
            User.getINSTANCE().addPoints(currentQuestion.calculatePoints());
        }
    }

    private boolean anyInput() {
        return !input.getText().equals("");
    }

    public void nextQuestion(ActionEvent actionEvent) {
        currentQuestion.clickNext(alert);
        if(currentQuestion.state instanceof AnsweredState) {
            updateQuestion();
            if(currentQuestion != null) {
                displayQuestion();
            } else {
                goTo.execute(actionEvent, "../view/endOfTest.fxml");
            }
        }
    }
}
