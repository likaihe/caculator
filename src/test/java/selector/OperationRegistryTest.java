package selector;

import operations.IOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static util.TestUtil.randomString;

class OperationRegistryTest {

    private OperationRegistry operationRegistry;


    @BeforeEach
    void setUp() {
        operationRegistry = new OperationRegistry();
    }

    @Test
    void getOperation_can_register_and_get_operation() {
        //Given
        final IOperation myOperation = mock(IOperation.class);
        final String myOperationString = randomString();
        operationRegistry.registerNewOperation(myOperationString, myOperation);
        //When
        final IOperation result = operationRegistry.getOperation(myOperationString);
        //Then
        assertEquals(myOperation, result);
    }

    @Test
    void getOperation_cannot_get_operation_when_it_does_not_register() {
        //Given
        final IOperation myOperation = mock(IOperation.class);
        final String myOperationString = randomString();
        operationRegistry.registerNewOperation(randomString(), myOperation);
        //When
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            operationRegistry.getOperation(myOperationString);
        });
        //Then
        assertEquals(String.format("'%s' is an unsupported operation.",myOperationString), exception.getMessage());
    }
}
