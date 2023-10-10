package operations;


public interface IOperation {
    /**
     * An interface that all operation should implement it
     * It takes two input and return a result.
     * @param v1 The first input.
     * @param v2 The second input.
     * @return The result of the calculate.
     */
    double doCalculate(double v1, double v2);
}
