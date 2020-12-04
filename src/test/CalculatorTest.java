package test;

import main.Calculator;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void calculateBiNormalTest() {
        Calculator calculator = new Calculator();
        assertEquals(NaN, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
    }

    @Test
    public void calculateBiAddTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        assertEquals(5.5, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.5));
    }

    @Test
    public void calculateBiMinusTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.minus, 2.0);
        assertEquals(-1.5, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.5));
    }

    @Test
    public void calculateBiMultiplyTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.multiply, 2.0);
        assertEquals(6.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
    }

    @Test
    public void calculateBiDivideTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.divide, 2.0);
        assertEquals(1.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
    }

    @Test
    public void calculateEqualTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.add, 6.0);
        calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        assertEquals(11.4, calculator.calculateEqual(3.4));
    }

    @Test
    public void resetTest() {
        Calculator calculator = new Calculator();
        calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
        assertEquals(8.4, calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0));
        assertEquals(NaN, calculator.reset());
    }

    @Test
    public void calculateMonoSquareTest() {
        Calculator calculator = new Calculator();
        assertEquals(9.0, calculator.calculateMono(Calculator.MonoOperatorModes.square, 3.000));
    }

    @Test
    public void calculateMonoSquareRootTest() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0));
    }

    @Test
    public void calculateMonoDivideByTest() {
        Calculator calculator = new Calculator();
        assertEquals(0.10, calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0));
    }

    @Test
    public void calculateMonoSinTest() {
        Calculator calculator = new Calculator();
        assertEquals(0.5, calculator.calculateMono(Calculator.MonoOperatorModes.sin, java.lang.Math.PI / 2), 0.0000000001);
    }

    @Test
    void CalculateMonoLogTest() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.calculateMono(Calculator.MonoOperatorModes.log, 100.0));
    }

    @Test
    void CalculateMonoRateTest() {
        Calculator calculator = new Calculator();
        assertEquals(.75, calculator.calculateMono(Calculator.MonoOperatorModes.rate, 75.0));
    }

    @Test
    void CalculateMonoAbsTest() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, -3.0));
        assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, 3.0));
    }
}