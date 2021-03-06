package sample.model;

import javafx.scene.control.Label;

public abstract class Question {
    String content;
    public State state;
    public String correctAnswer;
    public String userAnswer;

    public Question() {}

    public Question(Question question) {
        if (question != null) {
            content = question.content;
            state = question.state;
            correctAnswer = question.correctAnswer;
            userAnswer = question.userAnswer;
        }
    }

    /*
        Clone method represents design pattern: PROTOTYPE
     */
    public abstract Question clone();

    public int calculatePoints() {
        return 1;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickAnswer(Label label) {
        state.clickAnswer(label);
    }

    public void clickNext(Label label) {
        state.clickNext(label);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public State getState() {
        return state;
    }

    public String getContent() {
        return content;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public boolean isCorrect() {
        return correctAnswer.equals(userAnswer);
    }
}
