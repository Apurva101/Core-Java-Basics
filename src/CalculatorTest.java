import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd()
    {
        int result = calc.add(5, 6);
        assertEquals(result, 11);

    }

    @Test
    public void testSubtract()
    {
        int result = calc.subtract(5, 6);

        assertEquals( -1, result);
    }

    @Test
    public void testMultiply()
    {
        int result = calc.multiply(5,6);

        assertEquals(36, result);
    }

    @Test
    public void testDivide()
    {
        float result = calc.divide(15, 5);

        assertEquals(3, result, 0.02);
    }




}
