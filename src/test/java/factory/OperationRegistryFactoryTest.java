package factory;

import operations.Addition;
import operations.Division;
import operations.IOperation;
import operations.Multiplication;
import operations.Subtraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationRegistryFactoryTest {

    private OperationRegistryFactory operationRegistryFactory;

    @BeforeEach
    void setUp() {
        operationRegistryFactory = new OperationRegistryFactory();
    }

    @Test
    void createOperationRegistry_can_register_add() {
        can_get_operation("+", Addition.class);
    }

    @Test
    void createOperationRegistry_can_register_sub() {
        can_get_operation("-", Subtraction.class);
    }

    @Test
    void createOperationRegistry_can_register_multi() {
        can_get_operation("*", Multiplication.class);
    }

    @Test
    void createOperationRegistry_can_register_div() {
        can_get_operation("/", Division.class);
    }

    private void can_get_operation(String operation, Class<? extends IOperation> operationClass) {
        //When
        final IOperation operationInstance = operationRegistryFactory.createOperationRegistry().getOperation(operation);
        //Then
        assertEquals(operationInstance.getClass(), operationClass);
    }
}
