package hexlet.code.games;

import java.util.Random;

public final class GCDGame {
    private static final int NUMBER_ORIGIN = 2;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private static Integer a;
    private static Integer b;

    public static String getMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getNewQuestion() {
        a = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        b = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return a + " " + b;
    }

    public static String getCurrentAnswer() {
        Integer gcd = 0;

        for (int i = 1; i <= (a > b ? b : a); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd.toString();
    }
}
