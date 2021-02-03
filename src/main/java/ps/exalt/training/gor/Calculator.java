package ps.exalt.training.gor;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0)
            throw new UnsupportedOperationException("Can't divide by zero.");

        return a / b;
    }

    public static double modulo(double a, double b) {
        if (b == 0)
            throw new UnsupportedOperationException("Can't divide by zero.");

        return a % b;
    }
}
