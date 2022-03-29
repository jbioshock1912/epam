package epam.calculator.operators;

public class MultiplyOperation implements MathOperation {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public String getOperation() {
        return "*";
    }
}
