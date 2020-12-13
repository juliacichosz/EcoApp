package sample.model;

import javafx.scene.control.Label;

public abstract class Question implements IQuestion {
    String content;
    Integer id;
    public State state;
    public String correctAnswer;
    public String userAnswer;

    /*public Question(String content, Integer id, List<String> answers, int correctAnswer) {
        this.content = content;
        this.id = id;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.state = new NonAnswerd(this);
    }*/

    public Question() {}

    public Question(Question question) {
        if (question != null) {
            id = question.id;
            content = question.content;
            state = question.state;
            correctAnswer = question.correctAnswer;
            userAnswer = question.userAnswer;
        }
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

    public abstract Question clone();

    @Override
    public int calculatePoints() {
        return 1;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
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
        return correctAnswer == userAnswer;
    }
}