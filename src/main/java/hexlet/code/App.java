package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.GreetGame;

import java.util.*;

public class App {
    private static List<Game> games;
    private static Scanner scanner = new Scanner(System.in);

    static {
        games = new ArrayList();
        games.add(new EvenGame());
        games.add(new GreetGame());
    }

    private static void printMenu(){
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
        if (i == 0)
            return null;

        return games.get(i - 1);
    }

    public static void main(String[] args) {
        Game currentGame = chooseGame();

        if (currentGame == null)
            return;

        System.out.println("Welcome to the Brain Games!");
        String player = Cli.metting();
        currentGame.play(player);
    }
}
