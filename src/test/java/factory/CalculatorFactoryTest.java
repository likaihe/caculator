package factory;

import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Display;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class CalculatorFactoryTest {

    private OperationRegistryFactory registryFactory;
    private CalculatorFactory calculatorFactory;

    @BeforeEach
    void setUp() {
        registryFactory = mock(OperationRegistryFactory.class);
        calculatorFactory = new CalculatorFactory(registryFactory, mock(Display.class));
    }

    @Test
    void createCalculator_can_create_the_calculator() {
        //Should create a calculator instance
        assertEquals(Calculator.class, calculatorFactory.createCalculator().getClass());
    }

    @Test
    void createCalculator_can_create_the_calculator_with_operationRegistry() {
        //when
        calculatorFactory.createCalculator();
        //then
        then(registryFactory).should().createOperationRegistry();
    }
}
