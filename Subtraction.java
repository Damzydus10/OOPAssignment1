public class Subtraction extends Operation {

    public Subtraction(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double calculate() {
        return getNumber1() - getNumber2();
    }

    @Override
    public void displayResult() {
        System.out.println("Subtraction Result: " + calculate());
    }
}
