package sebastian;

public class Calculator {

    public double number;
    public double number2;

    public void setNumber(double number) {
        this.number = number;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double add() {
        return number + number2;
    }

    public double subtract() {
        return number - number2;
    }

    public double multiply() {
        return number * number2;
    }

    public double divide() {
        double quotient = number / number2;
        return quotient;
    }
}
