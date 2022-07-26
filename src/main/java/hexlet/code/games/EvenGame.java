package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class EvenGame implements Game {
    private static final int NUMBER_ORIGIN = 0;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private Integer number;

    @Override
    public String getName() {
        return "Even";
    }

    @Override
    public String getMessage() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public String getNewQuestion() {
        number = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return number.toString();
    }

    @Override
    public String getCurrentAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }
}
