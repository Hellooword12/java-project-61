package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
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
            case 0:
                System.out.println("Good bye!");
                break;
            case 1:
                Cli.hell();
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calc.calcGame();
                break;
            case 4:
                Gcd.gcdGame();
                break;
            case 5:
                Progression.progressionGame();
                break;
            case 6:
                Prime.primeGame();
                break;
            default:
                System.out.println("Default");
        }
    }
}
