public class CalculatorImpl implements Calculator {

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double difference(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
