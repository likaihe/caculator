import calculator.Calculator;
import factory.CalculatorFactory;

public class main {
    public static void main(String[] args) {
        final Calculator calculator = new CalculatorFactory().createCalculator();

        try {
            calculator.calculate(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2]));
        } catch (Exception e) {
            // todo need to define error handling
            System.out.println(e);
        }
    }
}
