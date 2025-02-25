package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Prime {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBER_OF_QUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);
            questionAnswer[1] = isPrime(randomNumber) ? "yes" : "no";
        }
        return questionAndAnswers;

    }

    // Метод для вычисления простого числа
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startGame() {
        startEngine(generateRoundData(), QUESTION);
    }
}
