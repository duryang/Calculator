package ps.exalt.training.gor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(
                4.2,
                Calculator.add(1.5, 2.7));

        assertEquals(
                -4.2,
                Calculator.add(-1.5, -2.7));
    }

    @Test
    void subtract() {
        assertEquals(
                2.9,
                Calculator.subtract(5, 2.1));

        assertEquals(
                -4.2,
                Calculator.subtract(-1.5, 2.7));
    }

    @Test
    void multiply() {
        assertEquals(
                2.25,
                Calculator.multiply(1.5, 1.5));

        assertEquals(
                -2.25,
                Calculator.multiply(1.5, -1.5));

        assertEquals(
                3,
                Calculator.multiply(-1.5, -2));
    }

    @Test
    void divide() {
        assertEquals(
                1.5,
                Calculator.divide(3, 2));

        assertEquals(
                -1.25,
                Calculator.divide(5, -4));

        assertThrows(
                UnsupportedOperationException.class,
                () -> Calculator.divide(1, 0));
    }

    @Test
    void modulo() {
        assertEquals(
                1,
                Calculator.modulo(6, 5));

        assertEquals(
                -1,
                Calculator.modulo(-1, 5));

        assertThrows(
                UnsupportedOperationException.class,
                () -> Calculator.modulo(1, 0));
    }
}