package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Engine {
    private static final int ROUND_COUNT = 3;

    private static String currentGame;
    private static String currentPlayer;
    private static Scanner scanner = new Scanner(System.in);

    public static String getMessage() {
        return switch (currentGame) {
            case "Even" -> EvenGame.getMessage();
            case "Calc" -> CalcGame.getMessage();
            case "GCD" -> GCDGame.getMessage();
            case "Progression" -> ProgressionGame.getMessage();
            case "Prime" -> PrimeGame.getMessage();
            default -> null;
        };
    }

    public static String getNewQuestion() {
        return switch (currentGame) {
            case "Even" -> EvenGame.getNewQuestion();
            case "Calc" -> CalcGame.getNewQuestion();
            case "GCD" -> GCDGame.getNewQuestion();
            case "Progression" -> ProgressionGame.getNewQuestion();
            case "Prime" -> PrimeGame.getNewQuestion();
            default -> null;
        };
    }

    public static String getCurrentAnswer() {
        return switch (currentGame) {
            case "Even" -> EvenGame.getCurrentAnswer();
            case "Calc" -> CalcGame.getCurrentAnswer();
            case "GCD" -> GCDGame.getCurrentAnswer();
            case "Progression" -> ProgressionGame.getCurrentAnswer();
            case "Prime" -> PrimeGame.getCurrentAnswer();
            default -> null;
        };
    }

    private static boolean playRound() {
        System.out.println("Question: " + getNewQuestion());
        System.out.print("Your answer: ");

        var playerAnswer = scanner.next().toLowerCase().trim();

        if (playerAnswer.equals(getCurrentAnswer())) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(
                    "'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + getCurrentAnswer() + "'.");
            System.out.println("Let's try again, " + currentPlayer + "!");
            return false;
        }
    }

    public static boolean play(String game, String player) {
        if (game.equals("Greet")) {
            return false;
        }

        currentGame = game;
        currentPlayer = player;

        System.out.println(getMessage());

        int round = 1;
        boolean result = true;

        while (round <= ROUND_COUNT && result) {
            result = playRound();
            round++;
        }

        return result;
    }
}
