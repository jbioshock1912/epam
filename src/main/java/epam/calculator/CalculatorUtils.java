package epam.calculator;

import java.util.List;

final class CalculatorUtils {

    private static final List<String> OPERATORS = List.of("+", "-", "/", "*");
    private CalculatorUtils() {}

    static boolean isOperator(String token) {
        return OPERATORS.contains(token);
    }

    static boolean isLeftBracket(String token) {
        return token.equals("(");
    }

    static boolean isRightBracket(String token) {
        return token.equals(")");
    }

    static int definePriority(String operation) {
        return operation.equals("+") || operation.equals("-") ? 1 : 2;
    }
}
