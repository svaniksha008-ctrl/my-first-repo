import java.util.Scanner;

public class calculator {
    
    // Addition operation
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Subtraction operation
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Multiplication operation
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Division operation
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean continueCalculation = true;
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: + (add), - (subtract), * (multiply), / (divide), q (quit)");
        System.out.println();
        
        while (continueCalculation) {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);
                
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                switch (operation) {
                    case '+':
                        result = add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        if (num2 != 0) {
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid operation! Please use +, -, *, or /");
                }
                
                System.out.print("\nContinue calculating? (yes/no): ");
                String response = scanner.next().toLowerCase();
                if (response.equals("no") || response.equals("n")) {
                    continueCalculation = false;
                }
                System.out.println();
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid numbers.");
                scanner.nextLine();
            }
        }
        
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
