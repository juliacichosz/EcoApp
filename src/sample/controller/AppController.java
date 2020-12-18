package sample.controller;

import sample.model.*;

import java.util.*;

/*
    Implementing IInitializable (overriding initialize method) and extending AppController
    represent design pattern: TEMPLATE METHOD
 */
public abstract class AppController implements IInitializable {
    GoTo goTo = new GoTo();

    static Questions questions = new Questions();

    //TODO: implement a lot of valid questions
    public void getInputQuestionsCategory() {
        clear();
        List<Question> allQuestions = new ArrayList<>();
        
        QuestionWithInput question0 = new QuestionWithInput();
        question0.setContent("Which toothbrush should you choose?");
        question0.correctAnswer = "bamboo";
        question0.changeState(new NonAnsweredState(question0));
        allQuestions.add(question0);

        QuestionWithInput question1 = new QuestionWithInput();
        question1.setContent("Use ... instead of disposable towels.");
        question1.correctAnswer = "cloths";
        question1.changeState(new NonAnsweredState(question1));
        allQuestions.add(question1);

        QuestionWithInput question2 = new QuestionWithInput();
        question2.setContent("Cook with a ... to save electricity and save time.");
        question2.correctAnswer = "lid";
        question2.changeState(new NonAnsweredState(question2));
        allQuestions.add(question2);

        QuestionWithInput question3 = new QuestionWithInput();
        question3.setContent("A ... instead of a bath.");
        question3.correctAnswer = "shower";
        question3.changeState(new NonAnsweredState(question3));
        allQuestions.add(question3);

        QuestionWithInput question4 = new QuestionWithInput();
        question4.setContent("Use ... straws instead of plastic.");
        question4.correctAnswer = "metal";
        question4.changeState(new NonAnsweredState(question4));
        allQuestions.add(question4);

        QuestionWithInput question5 = new QuestionWithInput();
        question5.setContent("Buy food from ... farmers.");
        question5.correctAnswer = "local";
        question5.changeState(new NonAnsweredState(question5));
        allQuestions.add(question5);

        QuestionWithInput question6 = new QuestionWithInput();
        question6.setContent("Use a ... instead of a vacuum cleaner.");
        question6.correctAnswer = "broom";
        question6.changeState(new NonAnsweredState(question6));
        allQuestions.add(question6);

        Question questionBonus0 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus0.setContent("Buy ... things so that they last longer.");
        questionBonus0.correctAnswer = "better-quality";
        questionBonus0.changeState(new NonAnsweredState(questionBonus0));
        allQuestions.add(questionBonus0);

        Question questionBonus1 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus1.setContent("Minimize the purchase of ... ... .");
        questionBonus1.correctAnswer = "unnecessary products";
        questionBonus1.changeState(new NonAnsweredState(questionBonus1));
        allQuestions.add(questionBonus1);

        Question questionBonus2 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus2.setContent("Buy tickets in ... ... .");
        questionBonus2.correctAnswer = "electronic version";
        questionBonus2.changeState(new NonAnsweredState(questionBonus2));
        allQuestions.add(questionBonus2);

        Question questionBonus3 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus3.setContent("Convert old clothes into ... .");
        questionBonus3.correctAnswer = "cloths";
        questionBonus3.changeState(new NonAnsweredState(questionBonus3));
        allQuestions.add(questionBonus3);

        Question questionBonus4 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus4.setContent("Eat ... meat.");
        questionBonus4.correctAnswer = "less";
        questionBonus4.changeState(new NonAnsweredState(questionBonus4));
        allQuestions.add(questionBonus4);

        Question questionBonus5 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus5.setContent("Buy ... appliances.");
        questionBonus5.correctAnswer = "energy-saving";
        questionBonus5.changeState(new NonAnsweredState(questionBonus5));
        allQuestions.add(questionBonus5);

        Question questionBonus6 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus6.setContent("Use ... instead of an elevator");
        questionBonus6.correctAnswer = "stairs";
        questionBonus6.changeState(new NonAnsweredState(questionBonus6));
        allQuestions.add(questionBonus6);

        Question questionBonus7 = new QuestionWithBonus(new QuestionWithInput());
        questionBonus7.setContent("Use ... food boxes.");
        questionBonus7.correctAnswer = "reusable";
        questionBonus7.changeState(new NonAnsweredState(questionBonus7));
        allQuestions.add(questionBonus7);

        Collections.shuffle(allQuestions);

        for(int i = 0; i < 5; i++) {
            questions.addQuestion(allQuestions.get(i));
        }
    }

    public void getOneChoiceQuestionsCategory() {
        clear();
        List<Question> allQuestions = new ArrayList<>();

        QuestionWithOneChoice question0 = new QuestionWithOneChoice();
        question0.setContent("Which toothbrush should you choose?");
        List<String> answers0 = new ArrayList<>();
        answers0.add("plastic");
        answers0.add("metal");
        answers0.add("bamboo");
        answers0.add("ceramic");
        question0.answers = answers0;
        question0.correctAnswer = "bamboo";
        question0.changeState(new NonAnsweredState(question0));
        allQuestions.add(question0);

        QuestionWithOneChoice question1 = new QuestionWithOneChoice();
        question1.setContent("What should you do with fruit washing water?");
        List<String> answers1 = new ArrayList<>();
        answers1.add("pour it down the sink");
        answers1.add("throw it down the toilet");
        answers1.add("leave for the next wash");
        answers1.add("leave for watering the plants");
        question1.answers = answers1;
        question1.correctAnswer = "leave for watering the plants";
        question1.changeState(new NonAnsweredState(question1));
        allQuestions.add(question1);

        QuestionWithOneChoice question2 = new QuestionWithOneChoice();
        question2.setContent("What should you use to clean up the kitchen?");
        List<String> answers2 = new ArrayList<>();
        answers2.add("cloth");
        answers2.add("paper towel");
        answers2.add("toilet paper");
        answers2.add("brown toilet paper");
        question2.answers = answers2;
        question2.correctAnswer = "cloth";
        question2.changeState(new NonAnsweredState(question2));
        allQuestions.add(question2);

        QuestionWithOneChoice question3 = new QuestionWithOneChoice();
        question3.setContent("Indicate which behavior isn't eco-friendly:");
        List<String> answers3 = new ArrayList<>();
        answers3.add("freezing food");
        answers3.add("cooking with a lid");
        answers3.add("eating less meat");
        answers3.add("cooking for one day");
        question3.answers = answers3;
        question3.correctAnswer = "cooking for one day";
        question3.changeState(new NonAnsweredState(question3));
        allQuestions.add(question3);

        QuestionWithOneChoice question4 = new QuestionWithOneChoice();
        question4.setContent("Indicate which behavior is eco-friendly:");
        List<String> answers4 = new ArrayList<>();
        answers4.add("buying worse-quality things against consumerism");
        answers4.add("buying better-quality things so that they look better");
        answers4.add("buying worse-quality things to save money");
        answers4.add("buying better-quality things so that they last longer");
        question4.answers = answers4;
        question4.correctAnswer = "buying better-quality things so that they last longer";
        question4.changeState(new NonAnsweredState(question4));
        allQuestions.add(question4);

        QuestionWithOneChoice question5 = new QuestionWithOneChoice();
        question5.setContent("What should you do with old furniture?");
        List<String> answers5 = new ArrayList<>();
        answers5.add("throw away");
        answers5.add("burn");
        answers5.add("throw into the river");
        answers5.add("remake");
        question5.answers = answers5;
        question5.correctAnswer = "remake";
        question5.changeState(new NonAnsweredState(question5));
        allQuestions.add(question5);

        QuestionWithOneChoice question6 = new QuestionWithOneChoice();
        question6.setContent("Indicate which gift isn't eco-friendly:");
        List<String> answers6 = new ArrayList<>();
        answers6.add("useless");
        answers6.add("useful");
        answers6.add("second-hand");
        answers6.add("self-made");
        question6.answers = answers6;
        question6.correctAnswer = "useless";
        question6.changeState(new NonAnsweredState(question6));
        allQuestions.add(question6);

        QuestionWithOneChoice question7 = new QuestionWithOneChoice();
        question7.setContent("Indicate which behavior isn't eco-friendly:");
        List<String> answers7 = new ArrayList<>();
        answers7.add("cycling");
        answers7.add("walking");
        answers7.add("using public transport");
        answers7.add("driving");
        question7.answers = answers7;
        question7.correctAnswer = "driving";
        question7.changeState(new NonAnsweredState(question7));
        allQuestions.add(question7);

        QuestionWithOneChoice question8 = new QuestionWithOneChoice();
        question8.setContent("Indicate which behavior isn't eco-friendly:");
        List<String> answers8 = new ArrayList<>();
        answers8.add("eco driving");
        answers8.add("using gray gift wrapping paper");
        answers8.add("littering");
        answers8.add("using stairs instead of an elevator");
        question8.answers = answers8;
        question8.correctAnswer = "littering";
        question8.changeState(new NonAnsweredState(question8));
        allQuestions.add(question8);

        QuestionWithOneChoice question9 = new QuestionWithOneChoice();
        question9.setContent("Which is the best for environment?");
        List<String> answers9 = new ArrayList<>();
        answers9.add("buying food from local farmers");
        answers9.add("bath instead of a shower");
        answers9.add("overheating the room instead of an extra blanket");
        answers9.add("watering plants with fresh water");
        question9.answers = answers9;
        question9.correctAnswer = "buying food from local farmers";
        question9.changeState(new NonAnsweredState(question9));
        allQuestions.add(question9);

        QuestionWithOneChoice question10 = new QuestionWithOneChoice();
        question10.setContent("Which is the best for environment?");
        List<String> answers10 = new ArrayList<>();
        answers10.add("buying tickets in electronic version");
        answers10.add("buying tickets made of recycled plastic");
        answers10.add("buying tickets with delivery");
        answers10.add("buying tickets made of paper");
        question10.answers = answers10;
        question10.correctAnswer = "buying tickets in electronic version";
        question10.changeState(new NonAnsweredState(question10));
        allQuestions.add(question10);

        QuestionWithOneChoice question11 = new QuestionWithOneChoice();
        question11.setContent("Indicate which behavior isn't eco-friendly:");
        List<String> answers11 = new ArrayList<>();
        answers11.add("freezing food");
        answers11.add("using a vacuum cleaner");
        answers11.add("baking several dishes in the oven at once");
        answers11.add("using reusable food boxes");
        question11.answers = answers11;
        question11.correctAnswer = "using a vacuum cleaner";
        question11.changeState(new NonAnsweredState(question11));
        allQuestions.add(question11);

        QuestionWithOneChoice question12 = new QuestionWithOneChoice();
        question12.setContent("Take ... for shopping and go greener.");
        List<String> answers12 = new ArrayList<>();
        answers12.add("gift wrapping paper");
        answers12.add("plastic bags");
        answers12.add("food containers");
        answers12.add("no shopping list");
        question12.answers = answers12;
        question12.correctAnswer = "leave for watering the plants";
        question12.changeState(new NonAnsweredState(question12));
        allQuestions.add(question12);

        QuestionWithOneChoice question13 = new QuestionWithOneChoice();
        question13.setContent("Is it ecological to use straws?");
        List<String> answers13 = new ArrayList<>();
        answers13.add("yes");
        answers13.add("no");
        answers13.add("yes, the plastic ones");
        answers13.add("yes, the metal ones");
        question13.answers = answers13;
        question13.correctAnswer = "yes, the metal ones";
        question13.changeState(new NonAnsweredState(question13));
        allQuestions.add(question13);

        QuestionWithOneChoice question14 = new QuestionWithOneChoice();
        question14.setContent("Indicate which behavior is eco-friendly:");
        List<String> answers14 = new ArrayList<>();
        answers14.add("buying energy-saving appliances");
        answers14.add("maximizing the purchase of unnecessary products");
        answers14.add("using disposable razors");
        answers14.add("stocking up on food");
        question14.answers = answers14;
        question14.correctAnswer = "buying energy-saving appliances";
        question14.changeState(new NonAnsweredState(question14));
        allQuestions.add(question14);

        Collections.shuffle(allQuestions);

        for(int i = 0; i < 5; i++) {
            questions.addQuestion(allQuestions.get(i));
        }
    }

    public void clear() {
        questions.clear();
        User.getINSTANCE().clearScore();
    }
}