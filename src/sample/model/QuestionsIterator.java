package sample.model;

/*
    QuestionsIterator class represents design pattern: ITERATOR
 */
public class QuestionsIterator implements IIterator {
    private Questions questions;
    private int currentPosition;

    public QuestionsIterator(Questions questions) {
        this.questions = questions;
        currentPosition = -1;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < (questions.getQuestions().size() - 1);
    }

    @Override
    public Question getNetx() {
        if(hasMore()) {
            return questions.getQuestions().get(++currentPosition);
        } else {
            return null;
        }
    }
}
