package sample.model;

public class QuestionWithInput extends Question {
    private String input;
    private String correctAnswer;

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
