package epam.topic_one;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void checkFibonacciPositive() {
        var number = Fibonacci.getFibonacciNumber(4);
        Assert.assertEquals(2, number);
    }

    @Test
    public void checkFibonacciNegative() {
        var number = Fibonacci.getFibonacciNumber(5);
        Assert.assertNotEquals(2, number);
    }
}
