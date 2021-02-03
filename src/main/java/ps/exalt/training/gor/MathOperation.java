package ps.exalt.training.gor;

public enum MathOperation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    MODULO;

    public static MathOperation getOperation(char op) {
        switch (op) {

            case '+':
                return MathOperation.ADD;

            case '-':
                return MathOperation.SUBTRACT;

            case '*':
                return MathOperation.MULTIPLY;

            case '/':
                return MathOperation.DIVIDE;

            case '%':
                return MathOperation.MODULO;

            default:
                throw new UnsupportedOperationException("Invalid operation.");
        }
    }
}
