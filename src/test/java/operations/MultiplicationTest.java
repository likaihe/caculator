package operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.TestUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {

    private Multiplication multiplication;

    @BeforeEach
    void setUp() {
        multiplication = new Multiplication();
    }

    @Test
    void doCalculate_can_do_multiplication() {
        //Given
        final double v1 = TestUtil.randomDouble();
        final double v2 = TestUtil.randomDouble();
        double expected = v1 * v2;
        //When
        final double result = multiplication.doCalculate(v1, v2);
        //Then
        assertEquals(expected, result);
    }
}
