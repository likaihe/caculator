package operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    private Subtraction subtraction;

    @BeforeEach
    void setUp() {
        subtraction = new Subtraction();
    }

    @Test
    void doCalculate_can_do_subtraction() {
        //Given
        final double v1 = TestUtil.randomDouble();
        final double v2 = TestUtil.randomDouble();
        double expected = v1 - v2;
        //When
        double result = subtraction.doCalculate(v1, v2);
        //Then
        assertEquals(expected, result);
    }
}
