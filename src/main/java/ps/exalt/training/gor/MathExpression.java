package ps.exalt.training.gor;

public class MathExpression {

    public MathExpression() {}

    public MathExpression(double leftSide, double rightSide, MathOperation operation) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.operation = operation;
    }

//    public MathExpression(String line) {
//        String[] parts = line.split(" ");
//
//        if (parts.length != 3)
//            throw new UnsupportedOperationException("Invalid operation.");
//
//        try {
//            leftSide = Double.parseDouble(parts[0]);
//            rightSide = Double.parseDouble(parts[2]);
//        } catch (Exception e) {
//            throw new UnsupportedOperationException("Invalid operation. Only numbers are accepted as inputs.");
//        }
//
//        operation = getOperation(parts[1]);
//    }

    private double leftSide;
    private double rightSide;
    private MathOperation operation;

    public double getLeftSide() {
        return leftSide;
    }
    public double getRightSide() {
        return rightSide;
    }
    public MathOperation getOperation() {
        return operation;
    }

    public double calculate(){
        switch (operation){

            case ADD:
                return Calculator.add(leftSide, rightSide);

            case SUBTRACT:
                return Calculator.subtract(leftSide, rightSide);

            case MULTIPLY:
                return Calculator.multiply(leftSide, rightSide);

            case DIVIDE:
                return Calculator.divide(leftSide, rightSide);

            case MODULO:
                return Calculator.modulo(leftSide, rightSide);

            default:
                return 0;
        }
    }

    public static MathExpression parse(String line) {
        line = line.trim();
        int indexOp = -1;

        // Start from index 1 because first char can be '-' in case of a negative number.
        for (int i = 1; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
                indexOp = i;
                break;
            }
        }

        if (indexOp == -1)
            throw new UnsupportedOperationException("Invalid operation. Operation sign not found.");

        MathOperation op = MathOperation.getOperation(line.charAt(indexOp));
        double left, right;

        try {
            left = Double.parseDouble(line.substring(0, indexOp).trim());
            right = Double.parseDouble(line.substring(indexOp + 1).trim());
        } catch (Exception e) {
            throw new UnsupportedOperationException("Invalid operation. Only numbers are accepted as inputs.");
        }

        return new MathExpression(left, right, op);
    }
}
