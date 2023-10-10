package factory;

import calculator.Calculator;
import selector.OperationRegistry;
import ui.Display;

public class CalculatorFactory {
    private final OperationRegistryFactory operationRegistryFactory;
    private final Display display;

    public CalculatorFactory(OperationRegistryFactory operationRegistryFactory, Display display) {
        this.operationRegistryFactory = operationRegistryFactory;
        this.display = display;
    }

    public CalculatorFactory() {
        this(new OperationRegistryFactory(), new Display());
    }

    public Calculator createCalculator() {
        final OperationRegistry operationRegistry = operationRegistryFactory.createOperationRegistry();
        return new Calculator(operationRegistry, display);
    }
}
