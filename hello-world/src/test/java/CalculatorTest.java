import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    Calculator calc;

    @BeforeAll
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void testaTvåPlusTvåÄrFyra() {
        AssertThat(calc.add(2,2)).isEqualTo(4);
    }
}
