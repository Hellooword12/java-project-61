
package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int NUMBER_OF_QUESTIONS = 3; // Количество вопросов
    private static final int MIN_PROGRESSION_LENGTH = 5; // Минимальная длина прогрессии
    private static final int MAX_PROGRESSION_LENGTH = 10; // Максимальная длина прогрессии
    private static final int MAX_START_NUMBER = 19; // Максимальное начальное число
    private static final int MIN_DIFFERENCE = 1; // Минимальная разность
    private static final int MAX_DIFFERENCE = 10; // Максимальная разность

    public static void progressionGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int length = random.nextInt(MAX_PROGRESSION_LENGTH - MIN_PROGRESSION_LENGTH + 1)
                    + MIN_PROGRESSION_LENGTH; // Длина от 5 до 10

            int start = random.nextInt(MAX_START_NUMBER + 1); // Начальное число от 0 до 19
            int difference = random.nextInt(MAX_DIFFERENCE - MIN_DIFFERENCE + 1)
                    + MIN_DIFFERENCE; // Разность от 1 до 10

            int[] progression = new int[length];
            for (int j = 0; j < length; j++) {
                progression[j] = start + j * difference;
            }

            int hiddenIndex = random.nextInt(length);
            progression[hiddenIndex] = -1;

            System.out.print("Question: ");
            for (int num : progression) {
                if (num == -1) {
                    System.out.print(".. ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = start + hiddenIndex * difference;

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + "."
                        + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
