package calculator;

import operations.IOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selector.OperationRegistry;
import ui.Display;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static util.TestUtil.randomDouble;
import static util.TestUtil.randomString;

class CalculatorTest {

    private Calculator calculator;
    private OperationRegistry registry;
    private Display display;

    @BeforeEach
    void setUp() {
        registry = mock(OperationRegistry.class);
        display = mock(Display.class);
        calculator = new Calculator(registry, display);
    }

    @Test
    void calculator_can_calculate() {
        final String operationString = randomString();
        final IOperation mockOperation = mock(IOperation.class);
        final double v1 = randomDouble();
        final double v2 = randomDouble();
        final double result = randomDouble();
        //Given
        given(registry.getOperation(operationString)).willReturn(mockOperation);
        given(mockOperation.doCalculate(v1, v2)).willReturn(result);
        //When
        calculator.calculate(v1, operationString, v2);
        //Then should display the result
        then(display).should().showOutput(result);
    }
}
