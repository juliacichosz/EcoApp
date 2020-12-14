package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private List<Question> questions;
    public int correctAnswersAmount = 0;

    public List<Question> getQuestions() {
        return questions;
    }

    public Questions() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public IIterator createIterator() {
        return new QuestionsIterator(this);
    }

    public void clear() {
        correctAnswersAmount = 0;
        questions.clear();
    }
}