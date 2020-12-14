package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import sample.model.IIterator;
import sample.model.Question;

import java.net.URL;
import java.util.ResourceBundle;

public class QuestionsSummary extends AppController {
    public Label question;
    public Label userAnswer;
    public Label correctAnswer;
    private Question currentQuestion;
    private final IIterator iterator = questions.createIterator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateQuestion();
        displayQuestion();
    }

    /*
        displayQuestion method represents design pattern: FACTORY
    */
    public void displayQuestion() {
        if(currentQuestion.isCorrect()) {
            displayCorrect(currentQuestion.clone());
        } else {
            displayIncorrect(currentQuestion.clone());
        }
    }

    public void displayCorrect(Question q) {
        question.setText(q.getContent());
        userAnswer.setText("Your answer is correnct: " + q.getUserAnswer());
        correctAnswer.setText("");
    }

    public void displayIncorrect(Question q) {
        question.setText(q.getContent());
        userAnswer.setText("Your answer is incorrect: " + q.getUserAnswer());
        correctAnswer.setText("Correct answer is: " + q.getCorrectAnswer());
    }

    private void updateQuestion() {
        currentQuestion = iterator.getNetx();
    }

    public void goToMenu(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/menu.fxml");
    }

    public void goToNextQuestion(ActionEvent actionEvent) {
        updateQuestion();
        if(currentQuestion != null) {
            displayQuestion();
        } else {
            goTo.execute(actionEvent, "../view/endOfGame.fxml");
        }
    }
}