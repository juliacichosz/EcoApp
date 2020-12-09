package sample.model;

import java.util.List;

public class QuestionWithOneChoice extends Question {
    private List<String> answers;
    private int correctAnswer;

    public QuestionWithOneChoice(){}

    public QuestionWithOneChoice(QuestionWithOneChoice questionWithOneChoice) {
        super(questionWithOneChoice);
        if(questionWithOneChoice != null) {
            this.answers = List.copyOf(questionWithOneChoice.answers);
            this.correctAnswer = questionWithOneChoice.correctAnswer;
        }
    }

    @Override
    public Question clone() {
        return new QuestionWithOneChoice(this);
    }
}
