import java.util.Scanner;

public class mainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Operation op; // Abstract class reference (Polymorphism in action)

        switch (choice) {
            case 1 -> op = new Addition(num1, num2);
            case 2 -> op = new Subtraction(num1, num2);
            default -> {
                System.out.println("Invalid choice!");
                sc.close();
                return;
            }
        }

        // Polymorphic behavior
        op.displayResult();

        sc.close();
    }
}
