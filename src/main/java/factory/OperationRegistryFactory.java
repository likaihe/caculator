package factory;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;
import selector.OperationRegistry;

public class OperationRegistryFactory {

    public OperationRegistry createOperationRegistry() {
        /***
         * New operation should be registered here.
         */
        final OperationRegistry registry = new OperationRegistry();
        registry.registerNewOperation("+", new Addition());
        registry.registerNewOperation("-", new Subtraction());
        registry.registerNewOperation("*", new Multiplication());
        registry.registerNewOperation("/", new Division());
        return registry;
    }
}
