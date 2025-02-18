package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static final int NUMBER_OF_QUESTIONS = 3;

    public static void calcGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {

            char[] signs = {'+', '-', '*'};
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            char sign = signs[random.nextInt(signs.length)];

            String expression = number1 + " " + sign + " " + number2;
            int correctAnswer = Engine.calculate(number1, number2, sign);
            System.out.println("Question: " + expression);

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + name + "!");
    }
}


