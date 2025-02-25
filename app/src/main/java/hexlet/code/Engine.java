package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3; // Количество вопросов

    public static void startEngine(String[][] questionAndAnswers, String question) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);

        for (var questionAnswer : questionAndAnswers) {
            System.out.println("Question: " + questionAnswer[0]);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(questionAnswer[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }

}

