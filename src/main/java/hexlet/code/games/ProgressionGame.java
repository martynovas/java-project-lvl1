package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class ProgressionGame implements Game {
    private static final int START_ORIGIN = 0;
    private static final int START_BOUND = 100;
    private static final int STEP_ORIGIN = 1;
    private static final int STEP_BOUND = 10;
    private static final int STEP_COUNT = 10;
    private static Random random = new Random();
    private Integer start;
    private Integer step;
    private Integer missedPosition;

    @Override
    public String getName() {
        return "Progression";
    }

    @Override
    public String getMessage() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getNewQuestion() {
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

    @Override
    public String getCurrentAnswer() {
        Integer result = start + (step * (missedPosition - 1));

        return result.toString();
    }
}
