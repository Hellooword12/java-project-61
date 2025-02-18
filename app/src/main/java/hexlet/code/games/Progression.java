package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int NUMBER_OF_QUESTIONS = 3;

    public static void progressionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int length = random.nextInt(6) + 5; // Длина от 5 до 10
            int start = random.nextInt(20); // Начальное число от 0 до 19
            int difference = random.nextInt(10) + 1; // Разность от 1 до 10

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
                        +
                        "Let's try again, Sam!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }
}
