package hexlet.code;

import hexlet.code.games.GreetGame;

import java.util.Scanner;

public class Engine {
    private static final int ROUND_COUNT = 3;
    private static Scanner scanner = new Scanner(System.in);

    private static boolean playRound(Game game, String player) {
        System.out.println("Question: " + game.getNewQuestion());
        System.out.print("Your answer: ");

        var playerAnswer = scanner.next().toLowerCase().trim();

        if (playerAnswer.equals(game.getCurrentAnswer())) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(
                    "'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + game.getCurrentAnswer() + "'.");
            System.out.println("Let's try again, " + player + "!");
            return false;
        }
    }

    public static boolean play(Game game, String player) {
        if (game instanceof GreetGame) {
            return false;
        }

        System.out.println(game.getMessage());

        int round = 1;
        boolean result = false;

        while (round <= ROUND_COUNT) {
            result = playRound(game, player);
            round++;
        }

        return result;
    }
}
