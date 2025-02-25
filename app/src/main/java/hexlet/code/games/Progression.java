
package hexlet.code.games;
import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Engine.startEngine;
import static hexlet.code.Utils.MAX;
import static hexlet.code.Utils.random;

public class Progression {
    private static final int MIN_PROGRESSION_LENGTH = 5; // Минимальная длина прогрессии
    private static final int MAX_PROGRESSION_LENGTH = 10; // Максимальная длина прогрессии
    private static final int MAX_START_NUMBER = 19; // Максимальное начальное число
    private static final int MIN_DIFFERENCE = 1; // Минимальная разность
    private static final int MAX_DIFFERENCE = 10; // Максимальная разность

    private static final String QUESTION = "\"What number is missing in the progression?";

    public static String[][] generateRoundData() {
        String[][] questionAndAnswers = new String[NUMBER_OF_QUESTIONS][2];
        for (var questionAnswer : questionAndAnswers) {
            var interval = random(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            var length = random(MIN_DIFFERENCE, MAX_DIFFERENCE);
            var randomNumber = random(1, MAX);
            var hollow = random(1, length);
            String[] createProgression = generateProgression(interval, length, randomNumber);
            String answer = createProgression[hollow - 1];
            createProgression[hollow - 1] = "..";
            questionAnswer[0] = String.join(" ", createProgression);
            questionAnswer[1] = answer;
        }
        return questionAndAnswers;
    }

    public static String[] generateProgression(int interval, int length, int number) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(number + i * interval);
        }
        return progression;
    }

    public static void startGame() {
        startEngine(generateRoundData(), QUESTION);
    }
}
