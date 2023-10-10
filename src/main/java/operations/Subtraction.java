package operations;

public class Subtraction implements IOperation {
    @Override
    public double doCalculate(double v1, double v2) {
        return v1 - v2;
    }
}
