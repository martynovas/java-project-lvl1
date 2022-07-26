package hexlet.code.games;

import java.util.Random;

public final class CalcGame {
    private static final int NUMBER_ORIGIN = 0;
    private static final int NUMBER_BOUND = 100;
    private static final int OPERATOR_COUNT = 3;
    private static Random random = new Random();

    private static Integer a;
    private static Integer b;
    private static String operator;

    public static String getMessage() {
        return "What is the result of the expression?";
    }

    public static String getNewQuestion() {
        a = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        b = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        int operatorId = random.nextInt(0, OPERATOR_COUNT);
        operator = switch (operatorId) {
            case 0 -> "+";
            case 1 -> "-";
            default -> "*";
        };

        return a + " " + operator + " " + b;
    }

    public static String getCurrentAnswer() {
        Integer result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new RuntimeException("Unsupported operation");
        };

        return result.toString();
    }
}
