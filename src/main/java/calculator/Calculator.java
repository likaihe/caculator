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
    public Calculator(OperationRegistry operationRegistry, Display display, Printer p) {
        this.operationRegistry = operationRegistry;
        this.display = display;
    }

    /***
     * Calculate and display the result.
     * @param v1 the first input.
     * @param operationString Represents the operation
     * @param v2 the second input
     */
    public void calculate(String ...args) {
        double result = operationRegistry.getOperation(operationString).doCalculate(args);
        p.print()
        display.showOutput(result);

    }
}
