package epam.calculator;

import epam.calculator.operators.*;
import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.Stack;

public class Calculator {

    private final Stack<String> stackPolish = new Stack<>();
    private final PolishConverter polishConverter = new PolishConverter();
    List<MathOperation> operations = List.of(new DivideOperation(), new SubstractOperation(), new SumOperation(), new MultiplyOperation());

    public int toCalculate(String[] symbols) {
        Stack<Integer> temporary = new Stack<Integer>();
        for (String symbol : symbols) {
            if (StringUtils.isNumeric(symbol)) {
                temporary.push(Integer.parseInt(symbol));
            } else {
                var operation = findOperation(symbol);
                int firstNumberFromStack = temporary.pop();
                int secondNumberFromStack = temporary.pop();
                var resultOperation = operation.calculate(secondNumberFromStack, firstNumberFromStack);
                temporary.push(resultOperation);
            }
        }
        return temporary.peek();
    }

    private MathOperation findOperation(String operation) {
        MathOperation result = null;
        for (MathOperation value : operations) {
            if (value.getOperation().equals(operation)) {
                result = value;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var calculator = new Calculator();
        String expression = "5*(10-100)+1000/6+7*8"; //-450+166+56=-228
        calculator.polishConverter.convertToPolishNotation(expression);
        System.out.println(calculator.toCalculate(calculator.polishConverter.getStackExit()));
    }
}
