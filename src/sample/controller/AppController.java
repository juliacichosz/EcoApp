package sample.controller;

import sample.model.*;

import java.util.*;

public abstract class AppController implements IInitializable {
    GoTo goTo = new GoTo();

    static Questions questions = new Questions();

    //TODO: implement valid questions
    public void getInputQuestionsCategory() {
        QuestionWithInput withInput = new QuestionWithInput();
        withInput.setContent("What is the correct answer?");
        withInput.correctAnswer = "correct";
        withInput.changeState(new NonAnsweredState(withInput));
        questions.addQuestion(withInput);

        QuestionWithInput withInput1 = new QuestionWithInput();
        withInput1.setContent("What is the correct answer second?");
        withInput1.correctAnswer = "correct second";
        withInput1.changeState(new NonAnsweredState(withInput1));
        questions.addQuestion(withInput1);
    }

    public void getOneChoiceQuestionsCategory() {
        QuestionWithOneChoice withOneChoice = new QuestionWithOneChoice();
        List<String> answers = new ArrayList<>();
        answers.add("ans0");
        answers.add("ans1");
        answers.add("ans2");
        answers.add("ans3");
        withOneChoice.answers = answers;
        withOneChoice.correctAnswer = 0;
        withOneChoice.setContent("Example question");
        withOneChoice.changeState(new NonAnsweredState(withOneChoice));
        // add to question list
        questions.addQuestion(withOneChoice);

        QuestionWithOneChoice withOneChoice1 = new QuestionWithOneChoice();
        List<String> answers1 = new ArrayList<>();
        answers1.add("ans0");
        answers1.add("ans1");
        answers1.add("ans2");
        answers1.add("ans3");
        withOneChoice1.answers = answers1;
        withOneChoice1.correctAnswer = 0;
        withOneChoice1.setContent("Second example question");
        withOneChoice1.changeState(new NonAnsweredState(withOneChoice1));
        // add to question list
        questions.addQuestion(withOneChoice1);

    }
}
