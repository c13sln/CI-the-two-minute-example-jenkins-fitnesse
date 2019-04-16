import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    static Calculator calc;

    @BeforeAll
    public static void init() {
        calc = new Calculator();
    }

    @Test
    public void testaTvaPlusTvaArFyra() {
        assertThat(calc.add(2,2), is(4));
        System.out.println("calc.add(2,2) is: " + calc.add(2,2));
    }

    @Test
    public void testaFyraGangerFyraArSexton() {
        assertThat(calc.multiply(4,4), is(16));
        System.out.println("calc.multiply(4,4) is: " + calc.multiply(4,4));
    }

    @Test
    public void testaSextonGenomFyraArFyra() {
        assertThat(calc.divide(16,4), is((long) 4.0));
        System.out.println("calc.divide(16,4) is: " + calc.divide(16,4));
    }

    @Test
    public void testaNollMinusTreArNegativtTre() {
        assertThat(calc.subtract(0,3), is(-3));
        System.out.println("calc.subtract(0,3) is: " + calc.subtract(0,3));
    }
}
