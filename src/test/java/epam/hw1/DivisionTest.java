package epam.hw1;


import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void dividePositive() {
        var number = Division.divide(10, 2);
        Assert.assertEquals(5, number);
    }

    @Test
    public void divideNegative() {
        var number = Division.divide(10, 2);
        Assert.assertNotEquals(2, number);
    }
}