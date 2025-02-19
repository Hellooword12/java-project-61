package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    private static final int NUMBER_OF_QUESTIONS = 3; // Количество вопросов
    private static final int MAX_RANDOM_NUMBER = 100; // Максимальное рандомное число

    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER);
            System.out.println("Question: " + number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return; // Завершаем игру
            } else {
                System.out.println("Correct!");
            }
        }

        System.out.println("Congratulations, " + name + "! You won!");

    }



}

