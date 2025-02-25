package hexlet.code.games;


import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Even {

    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBER_OF_QUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);
            questionAnswer[1] = checkEven(randomNumber) ? "yes" : "no";
        }
        return questionAndAnswers;

    }

    public static void startGame() {
        startEngine(generateRoundData(), QUESTION);
    }

    public static boolean checkEven(int randomNumber) {
        return randomNumber % 2 == 0;

    }

}

