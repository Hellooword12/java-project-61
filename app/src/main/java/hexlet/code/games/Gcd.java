
package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    private static final int NUMBER_OF_QUESTIONS = 3;  // Количество вопросов
    private static final int MAX_RANDOM_VALUE = 100;   // Максимальное значение для генерации случайных чисел

    public static void gcdGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number1 = random.nextInt(MAX_RANDOM_VALUE);          // Случайное число 1
            int number2 = random.nextInt(MAX_RANDOM_VALUE);          // Случайное число 2
            String expression = number1 + " " + number2;

            System.out.println("Question: " + expression);

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = Engine.gcd(number1, number2);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + "."
                        + " Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
