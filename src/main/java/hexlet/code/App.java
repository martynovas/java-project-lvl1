package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.GreetGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static List<Game> games;
    private static Scanner scanner = new Scanner(System.in);

    static {
        games = new ArrayList();
        games.add(new GreetGame());
        games.add(new EvenGame());
        games.add(new CalcGame());
        games.add(new GCDGame());
        games.add(new ProgressionGame());
        games.add(new PrimeGame());
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 0; i < games.size(); i++) {
            System.out.println((i + 1) + " - " + games.get(i).getName());
        }
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    private static Game chooseGame() {
        printMenu();

        var i = scanner.nextInt();
        if (i == 0) {
            return null;
        }

        return games.get(i - 1);
    }

    public static void main(String[] args) {
        Game currentGame = chooseGame();

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
