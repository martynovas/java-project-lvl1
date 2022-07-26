package hexlet.code.games;

import hexlet.code.Game;

public final class GreetGame implements Game {
    @Override
    public String getName() {
        return "Greet";
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public String getNewQuestion() {
        return null;
    }

    @Override
    public String getCurrentAnswer() {
        return null;
    }
}
