package sample.model;

import java.util.*;

public class QuestionWithOneChoice extends Question {
    public List<String> answers;
    public int correctAnswer;
    public int userAnswer;

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

    public void shuffle() {
        Random random = new Random();
        List<Integer> indexList = Arrays.asList(0,1,2,3);
        Collections.shuffle(indexList, random);
        String[] tmp = new String[4];
        for(int i = 0; i < 4; i++) {
            tmp[indexList.get(i)] = answers.get(i);
        }
        answers = Arrays.asList(tmp.clone());
        correctAnswer = indexList.get(correctAnswer);
    }
}
