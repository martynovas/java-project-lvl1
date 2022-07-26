package hexlet.code.games;

import java.util.Random;

public final class ProgressionGame {
    private static final int START_ORIGIN = 0;
    private static final int START_BOUND = 100;
    private static final int STEP_ORIGIN = 1;
    private static final int STEP_BOUND = 10;
    private static final int STEP_COUNT = 10;
    private static Random random = new Random();
    private static Integer start;
    private static Integer step;
    private static Integer missedPosition;

    public static String getMessage() {
        return "What number is missing in the progression?";
    }

    public static String getNewQuestion() {
        start = random.nextInt(START_ORIGIN, START_BOUND);
        step = random.nextInt(STEP_ORIGIN, STEP_BOUND);
        missedPosition = random.nextInt(1, STEP_COUNT + 1);
        String question = "";

        for (int i = 1; i <= STEP_COUNT; i++) {
            if (i == missedPosition) {
                question += ".. ";
            } else {
                question += (start + (step * (i - 1))) + " ";
            }
        }

        return question;
    }

    public static String getCurrentAnswer() {
        Integer result = start + (step * (missedPosition - 1));

        return result.toString();
    }
}
