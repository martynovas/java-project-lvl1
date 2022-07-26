package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String metting() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String player = scanner.next();
        System.out.println("Hello, " + player + "!");

        return player;
    }
}
