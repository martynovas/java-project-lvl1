package hexlet.code.games;

import java.util.Random;

public final class EvenGame {
    private static final int NUMBER_ORIGIN = 0;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();
    private static Integer number;

    public static String getMessage() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String getNewQuestion() {
        number = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);

        return number.toString();
    }

    public static String getCurrentAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }
}
