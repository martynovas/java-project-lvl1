package hexlet.code.games;

import hexlet.code.Game;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class EvenGame implements Game {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    @Override
    public String getName() {
        return "Even";
    }

    private static boolean playRound() {
        var number = random.nextInt(1, 100);

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");

        var playerAnswer = scanner.next().toLowerCase().trim();
        var correctAnswer = number % 2 == 0 ? "yes" : "no";

        if (playerAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'"+ playerAnswer +"' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }

    @Override
    public void play(String player) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (true) {
            var result = playRound();

            if (!result) {
                System.out.println("Let's try again, " + player + "!");
                break;
            }
        }
    }
}
