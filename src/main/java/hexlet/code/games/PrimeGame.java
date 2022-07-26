package hexlet.code.games;

import java.util.Random;

public final class PrimeGame {
    private static final int NUMBER_ORIGIN = 1;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private static Integer number;

    public static String getMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getNewQuestion() {
        number = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return number.toString();
    }

    private static boolean numberIsPrime() {
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String getCurrentAnswer() {
        if (numberIsPrime()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
