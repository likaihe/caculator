package selector;

import operations.IOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationRegistry {
    private final Map<String, IOperation> operationsMap = new HashMap<>();

    public void registerNewOperation(String operationString, IOperation operation) {
        this.operationsMap.put(operationString, operation);
    }

    public IOperation getOperation(String operationString) {
        return Optional.ofNullable(operationsMap.get(operationString))
                .orElseThrow(() -> new UnsupportedOperationException(String.format("'%s' is an unsupported operation.", operationString)));
    }
}
