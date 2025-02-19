package hexlet.code;


public class Engine {

    // Метод для вычисления результата выражения в калькуляторе
    public static int calculate(int num1, int num2, char sign) {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Неподдерживаемый знак: " + sign);
        }
    }

    // Метод для вычисления НОД
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Метод для вычисления простого числа
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
