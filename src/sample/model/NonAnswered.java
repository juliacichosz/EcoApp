package sample.model;

public class NonAnswered extends State {
    public NonAnswered(Question question) {
        super(question);
    }

    //Pamietac zeby nie zmieniala sie opcja zaznaczona gdy juz jest stan Aswered;
    @Override
    void clickAnswer() {
        question.changeState(new Answered(question));
    }

    @Override
    void clickNext() {
        //warrning nie mozna przejsc do kolejnego okna
    }
}

/*
przechodzic po pytaniach na koniec odpowiedzianych <-- FACTORY
*/
