package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Calc {

    private static final String QUESTION = "What is the result of the expression?";

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBER_OF_QUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            int num1 = random(1, MAX);
            int num2 = random(1, MAX);
            var randomNumber = (int) (Math.random() * NUMBER_OF_QUESTIONS) + 1;
            var array = new String[]{"0", "*", "+", "-"};
            var sign = array[randomNumber];
            questionAnswer[1] = String.valueOf(calculate(num1, num2, sign));
            questionAnswer[0] = Integer.toString(num1)
                    + " " + sign + " "
                    + Integer.toString(num2);
        }
        return questionAndAnswers;
    }

    // Метод для вычисления результата выражения в калькуляторе
    public static int calculate(int num1, int num2, String sign) {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Not found symbol: " + sign);
        }
    }

    public static void startGame() {
        startEngine(generateRoundData(), QUESTION);
    }

}


