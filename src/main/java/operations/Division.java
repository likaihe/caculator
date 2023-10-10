package operations;

public class Division implements IOperation {

    private static final String DENOMINATOR_CANNOT_BE_ZERO_ERROR_MESSAGE = "Denominator cannot be zero.";

    @Override
    public double doCalculate(double v1, double v2) {
        if (v2 == 0){
            throw new IllegalArgumentException(DENOMINATOR_CANNOT_BE_ZERO_ERROR_MESSAGE);
        }
        return v1 / v2;
    }
}
