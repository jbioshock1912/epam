package epam.calculator;

import org.apache.commons.lang3.StringUtils;
import java.util.Stack;

class PolishConverter {

    private static final String REGEX_SPLIT_EXPRESSION = "(?<=\\D)(?=\\d|\\D)|(?<=\\d|\\D)(?=\\D)"; //сплит по числам и символам
    private final Stack<String> stackExit = new Stack<>(); // стек выходной строки
    private final Stack<String> stackOperations = new Stack<>(); // стек для операторов

    void convertToPolishNotation(String expression) {
        String[] arraySymbols = expression.split(REGEX_SPLIT_EXPRESSION);
        for (String value : arraySymbols) {
            if (StringUtils.isNumeric(value)) {
                stackExit.push(value);
            } else if (CalculatorUtils.isOperator(value)) {
                while (!stackOperations.empty()
                        && CalculatorUtils.isOperator(stackOperations.lastElement())
                        && (CalculatorUtils.definePriority(value) <= CalculatorUtils.definePriority(stackOperations.lastElement()))) {
                    stackExit.push(stackOperations.pop());
                }
                stackOperations.push(value);
            } else if (CalculatorUtils.isLeftBracket(value)) {
                stackOperations.push(value);
            } else if (CalculatorUtils.isRightBracket(value)) {
                while (!stackOperations.empty()
                        && !CalculatorUtils.isLeftBracket(stackOperations.lastElement())) {
                    stackExit.push(stackOperations.pop()); }
                stackOperations.pop();
            } else {
                System.out.println("Unexpected item!");
                stackOperations.clear();
                stackExit.clear();
                return;
            }
        }
        while (!stackOperations.empty()) {
            stackExit.push(stackOperations.pop());
        }

        System.out.println("invalid character exception\n" + stackExit);
    }

    String[] getStackExit() {
        String[] array = new String[stackExit.size()];
        return stackExit.toArray(array);
    }
}
