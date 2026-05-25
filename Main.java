import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MDAS Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        System.out.print("Choose an operation (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {

            case 1:
                result = Addition.add(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 2:
                result = Subtraction.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 3:
                result = Multiplication.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}