package sample.model;

public class QuestionWithInput extends Question {
    public String input;
    public String correctAnswer;
    public String userAnswer;

    public QuestionWithInput(){}

    public QuestionWithInput(QuestionWithInput questionWithInput) {
        super(questionWithInput);
        if(questionWithInput != null) {
            this.input = questionWithInput.input;
            this.correctAnswer = questionWithInput.correctAnswer;
        }
    }

    @Override
    public Question clone() {
        return new QuestionWithInput(this);
    }
}
