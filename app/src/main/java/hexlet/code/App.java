package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GAME_EXIT = 0;
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        int number = scanner.nextInt();
        System.out.println("Your choice: " + number);
        switch (number) {
            case GAME_EXIT:
                System.out.println("Good bye!");
                break;
            case GAME_GREET:
                Cli.greet();
                break;
            case GAME_EVEN:
                Even.evenGame();
                break;
            case GAME_CALC:
                Calc.calcGame();
                break;
            case GAME_GCD:
                Gcd.gcdGame();
                break;
            case GAME_PROGRESSION:
                Progression.progressionGame();
                break;
            case GAME_PRIME:
                Prime.primeGame();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
