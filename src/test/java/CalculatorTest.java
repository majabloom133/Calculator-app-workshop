import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void testAddition() {
        // Creates test, checks if 5 + 5 = 10
        double expected = 10.0;
        double actual = 5.0 + 5.0;

        // Checks if both values are the same
        assertEquals(expected, actual, "Addition calculation failed!");
    }

    @Test
    public void testSubtraction() {
        // Will check if 20 - 8 = 12
        double expected = 12.0;
        double actual = 20.0 - 8.0;
        assertEquals(expected, actual, "Subtraction calculation failed!");
    }

    @Test
    public void testMultiplication() {
        // Will check if 5 * 4 = 20
        double expected = 20.0;
        double actual = 5.0 * 4.0;
        assertEquals(expected, actual, "Multiplication calculation failed!");
    }

    @Test
    public void testDivision() {
        // Will check if 10 / 2 = 5
        double expected = 5.0;
        double actual = 10.0 / 2.0;
        assertEquals(expected, actual, "Divison calculation failed!");
    }
}
