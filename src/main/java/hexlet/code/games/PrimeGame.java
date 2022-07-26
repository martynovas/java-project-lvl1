package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class PrimeGame implements Game {
    private static final int NUMBER_ORIGIN = 0;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private Integer number;

    @Override
    public String getName() {
        return "Prime";
    }

    @Override
    public String getMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getNewQuestion() {
        number = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return number.toString();
    }

    private boolean numberIsPrime() {
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String getCurrentAnswer() {
        if (numberIsPrime()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
