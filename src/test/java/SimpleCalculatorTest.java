import org.example.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    void TwoSumTwoShouldReturnFour(){
        var calculator = new SimpleCalculator();

        assertEquals(4, calculator.add(2,2));
    }
    @Test
    void ThreePlusSevenEqualsTen(){
        var cal = new SimpleCalculator();
        assertEquals(10,cal.add(3,7));
    }
}
