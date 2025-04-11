import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (A - Add, S - Subtract, M - Multiply, D - Divide): ");
        char operation = scanner.next().toUpperCase().charAt(0);

        double result = 0;

        switch (operation) {
            case 'A':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 'S':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 'M':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 'D':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
