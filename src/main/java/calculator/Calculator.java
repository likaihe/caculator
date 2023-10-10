package calculator;

import selector.OperationRegistry;
import ui.Display;

public class Calculator {
    private final OperationRegistry operationRegistry;
    private final Display display;

    /***
     * A calculator should have some supported operation and a place to display its result.
     * @param operationRegistry {@link OperationRegistry} hosts its supported operation
     * @param display {@link Display} to display result
     */
    public Calculator(OperationRegistry operationRegistry, Display display) {
        this.operationRegistry = operationRegistry;
        this.display = display;
    }

    /***
     * Calculate and display the result.
     * @param v1 the first input.
     * @param operationString Represents the operation
     * @param v2 the second input
     */
    public void calculate(double v1, String operationString, double v2) {
        double result = operationRegistry.getOperation(operationString).doCalculate(v1, v2);
        display.showOutput(result);
    }
}
