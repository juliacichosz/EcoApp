package sample.model;

import java.util.List;

public abstract class Question implements IQuestion {
    private String content;
    private Integer id;

    private State state;

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
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickAnswer() {
        state.clickAnswer();
    }

    public void clickNext() {
        state.clickNext();
    }

    public abstract Question clone();

    @Override
    public int calculatePoints() {
        return 1;
    }
}
