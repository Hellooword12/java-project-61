
package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.random;

public class Gcd {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static final int MAX = 100;

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBER_OF_QUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            int number1 = random(1, MAX);
            int number2 = random(1, MAX);
            questionAnswer[0] = Integer.toString(number1) + " " + Integer.toString(number2);
            questionAnswer[1] = Integer.toString(gcd(number1, number2));
        }
        return questionAndAnswers;

    }

    // Метод для вычисления НОД
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void startGame() {
        startEngine(generateRoundData(), QUESTION);
    }

}
