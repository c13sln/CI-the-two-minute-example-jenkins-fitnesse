import org.junit.jupiter.api.Test;
import sebastian.Calculator;
public class CalculatorTest {
    @Test
    public void testaAdd() {
        Calculator calculator = new Calculator();
        calculator.setNumber(8.0);
        calculator.setNumber2(2.0);
        assert(calculator.add() == 10.0);
    }

    @Test
    public void testaSubtract() {
        Calculator calculator = new Calculator();
        calculator.setNumber(8.0);
        calculator.setNumber2(2.0);
        assert(calculator.subtract() == 6.0);
    }

    @Test
    public void testaMultiply() {
        Calculator calculator = new Calculator();
        calculator.setNumber(8.0);
        calculator.setNumber2(2.0);
        assert(calculator.multiply() == 16.0);
    }

    @Test
    public void testaDivide() {
        Calculator calculator = new Calculator();
        calculator.setNumber(8.0);
        calculator.setNumber2(2.0);
        assert(calculator.divide() == 4.0);
    }

    @Test
    public void testaDivideMedKonstigaTal() {
        Calculator calculator = new Calculator();
        calculator.setNumber(9.0);
        calculator.setNumber2(2.0);
        assert(calculator.divide() == 4.5);
    }
}
