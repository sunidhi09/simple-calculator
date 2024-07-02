import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operation;

        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation! Please use +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
