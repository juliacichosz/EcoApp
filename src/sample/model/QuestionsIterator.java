package sample.model;

public class QuestionsIterator implements IIterator {
    private Questions questions;
    private int currentPosition;

    public QuestionsIterator(Questions questions) {
        this.questions = questions;
        currentPosition = 0;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < (questions.getQuestions().size() - 1);
    }

    @Override
    public Question getNetx() {
        return questions.getQuestions().get(currentPosition++);
    }
}
