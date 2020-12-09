package sample.model;

import java.util.ArrayList;
import java.util.List;

public final class User implements IObservable {
    private static String name;
    private int score;
    private static User INSTANCE;
    private List<IObserver> observers = new ArrayList<>();

    private User() {
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        User.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void setINSTANCE(User INSTANCE) {
        User.INSTANCE = INSTANCE;
    }

    public static User getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new User();
        }
        return INSTANCE;
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public void addPoints(int points) {
        this.score += points;
        if(score != 0 && score % 10 == 0) {
            notifyObservers();
        }
    }
}
