package fitnesse;

import fit.ColumnFixture;

/**
 * Originally copied from FitNesse source code.
 *
 */
public class Addition extends ColumnFixture {

	public double number;

	public double number2;

	public double sum() {
		double sum = number / number2;
		// For testing Project Issue #36
		/*if (quotient > 20.0) {
			throw new IllegalStateException("TEST EXCEPTION [Division]",
					new NullPointerException("NESTED"));
		}*/
		return sum;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
}
