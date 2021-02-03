package ps.exalt.training.gor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathExpressionTest {

    @Test
    void parse() {
        assertThrows(
                Exception.class,
                () -> {
                    MathExpression.parse("foo");
                });

        assertThrows(
                Exception.class,
                () -> {
                    MathExpression.parse("foo+foo");
                });

        assertThrows(
                Exception.class,
                () -> {
                    MathExpression.parse("-4.5^3");
                });

        assertThrows(
                Exception.class,
                () -> {
                    MathExpression.parse("- 2*3");
                });

        assertDoesNotThrow(
                () -> {
                    MathExpression.parse("-1 + 2.5");
                });

        assertDoesNotThrow(
                () -> {
                    MathExpression.parse("1*-2.5");
                });

        assertDoesNotThrow(
                () -> {
                    MathExpression.parse("   8    /2   ");
                });

        MathExpression exp = MathExpression.parse("4   /   -5.59");
        assertEquals(4, exp.getLeftSide());
        assertEquals(-5.59d, exp.getRightSide());
        assertEquals(MathOperation.DIVIDE, exp.getOperation());

        exp = MathExpression.parse("1.05*-3.3");
        assertEquals(1.05d, exp.getLeftSide());
        assertEquals(-3.3d, exp.getRightSide());
        assertEquals(MathOperation.MULTIPLY, exp.getOperation());

        exp = MathExpression.parse("    -5 % 4");
        assertEquals(-5, exp.getLeftSide());
        assertEquals(4, exp.getRightSide());
        assertEquals(MathOperation.MODULO, exp.getOperation());
    }

//    @Test
//    void add() {
//        assertEquals(10, MathExpression.add(4, 6));
//    }
}