import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class CalculatorTest {

    @Test
    public void testaAdd() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(2,2), is(4));
    }
}
