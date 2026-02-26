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
}
