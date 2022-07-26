package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public final class CalcGame implements Game {
    private static final int NUMBER_ORIGIN = 0;
    private static final int NUMBER_BOUND = 100;
    private static Random random = new Random();

    private Integer a;
    private Integer b;
    private Operator operator;


    private enum Operator {
        PLUS('+'),
        MINUS('-'),
        MULTIPLE('*');
        private char smb;

        Operator(char symbol) {
            this.smb = symbol;
        }
    }

    @Override
    public String getName() {
        return "Calc";
    }

    @Override
    public String getMessage() {
        return "What is the result of the expression?";
    }

    @Override
    public String getNewQuestion() {
        a = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        b = random.nextInt(NUMBER_ORIGIN, NUMBER_BOUND);
        int operatorId = random.nextInt(0, Operator.values().length);
        operator = Operator.values()[operatorId];

        return a + " " + operator.smb + " " + b;
    }

    @Override
    public String getCurrentAnswer() {
        Integer result = switch (operator) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLE -> a * b;
            default -> throw new RuntimeException("Unsupported operation");
        };

        return result.toString();
    }
}
