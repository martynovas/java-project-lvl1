package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    private static List<String> games;
    private static Scanner scanner = new Scanner(System.in);

    static {
        games = new ArrayList<String>();
        games.add("Greet");
        games.add("Even");
        games.add("Calc");
        games.add("GCD");
        games.add("Progression");
        games.add("Prime");
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 0; i < games.size(); i++) {
            System.out.println((i + 1) + " - " + games.get(i));
        }

        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    private static String chooseGame() {
        printMenu();

        int gameNumber = scanner.nextInt();
        if (gameNumber == 0) {
            return null;
        }

        if (gameNumber > games.size()) {
            System.out.println("Wrong game number!");
            return null;
        }

        return games.get(gameNumber - 1);
    }

    public static void main(String[] args) {
        String currentGame = chooseGame();

        if (currentGame == null) {
            return;
        }

        System.out.println("Welcome to the Brain Games!");
        String player = Cli.metting();

        boolean result = Engine.play(currentGame, player);

        if (result) {
            System.out.println("Congratulations, " + player + "!");
        }
    }
}
