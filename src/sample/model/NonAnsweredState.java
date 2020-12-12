package sample.model;

import javafx.scene.control.Label;

public class NonAnsweredState extends State {
    public NonAnsweredState(Question question) {
        super(question);
    }

    @Override
    public void clickAnswer(Label label) {
        label.setText("");
        question.changeState(new AnsweredState(question));
    }

    @Override
    public void clickNext(Label label) {
        label.setText("You have to answer the question.");
    }
}