package sample.model;

public class Answered extends State {
    public Answered(Question question) {
        super(question);
    }

    @Override
    void clickAnswer() {
        //warrning ze nie mozna przejsc do kolejnego stanu
    }

    @Override
    void clickNext() {
        //przejscie do kolejnego okna???
    }
}
