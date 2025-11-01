// Abstract class demonstrating Abstraction and Encapsulation
public abstract class Operation {
    // Encapsulated fields
    private double number1;
    private double number2;

    // Constructor
    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getters and Setters (Encapsulation)
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Abstract method (Abstraction)
    public abstract double calculate();

    // Concrete method that can be overridden
    public void displayResult() {
        System.out.println("Result: " + calculate());
    }
}
