package operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionTest {

    private Division division;

    @BeforeEach
    void setUp() {
        division = new Division();
    }

    @Test
    void doCalculate_can_divide_when_denominator_not_zero() {
        //Given
        final double v1 = TestUtil.randomDouble();
        final double v2 = TestUtil.randomNonZeroDouble();
        double expected = v1 / v2;

        //When
        final double result = division.doCalculate(v1, v2);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void doCalculate_failed_divide_when_denominator_zero() {
        //Given
        final double v1 = TestUtil.randomDouble();
        final double v2 = 0;
        String expectedMessage = "Denominator cannot be zero.";
        //When
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            division.doCalculate(v1, v2);
        });
        //Then
        assertEquals(expectedMessage, exception.getMessage());
    }
}
