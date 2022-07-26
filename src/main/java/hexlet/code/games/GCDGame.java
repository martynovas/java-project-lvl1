package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class GCDGame implements Game {
    private static final int NUMBER_ORIGIN = 2;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private Integer a;
    private Integer b;

    @Override
    public String getName() {
        return "GCD";
    }

    @Override
    public String getMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getNewQuestion() {
        a = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        b = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return a + " " + b;
    }

    @Override
    public String getCurrentAnswer() {
        Integer gcd = 0;

        for (int i = 1; i <= (a > b ? b : a); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd.toString();
    }
}
