package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final int NUMBER_OF_QUESTIONS = 3;

    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberRandom = random.nextInt(100);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = numberRandom;
            boolean correctAnswer = Engine.isPrime(number);
            System.out.println("Question: " + number);

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (correctAnswer && userAnswer.equals("yes")) {
                System.out.println("Correct!");
            } else if (!correctAnswer && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + "'no'" + ".");
                System.out.println("Let's try again, " + name + "!");
                return; // Завершаем игру
            }
        }
        System.out.println("Congratulations, " + name + "! You won!");
    }
}
