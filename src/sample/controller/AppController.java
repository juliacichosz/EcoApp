package sample.controller;

import sample.model.GoTo;
import sample.model.Questions;

public abstract class AppController implements IInitializable {
    //osobna klasa initializable, do implemenctacji zamiast tej wbudowanej

    GoTo goTo = new GoTo();

    private Questions questions = new Questions();

    //TODO: implement valid categories
    public void getInputQuestionsCategory() {}

    public void getOneChoiceSecondQuestionsCategory() {}
}
