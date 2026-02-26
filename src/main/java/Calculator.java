import java.util.Scanner;

public class Calculator {

    // Start the program
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean keepRunning = true;

        while (keepRunning) {
            double result = 0;

            // Add try to make sure program doesn't crash if user adds a number that's not valid
            try {
                System.out.println("--- Calculator ---");

                // This is where I will add the math
                // Ask for first number, ask for operator, ask for second number
                System.out.print("Enter the first number: ");
                double num1 = reader.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                String operator = reader.next();

                System.out.print("Enter the second number: ");
                double num2 = reader.nextDouble();

            // Add switch
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, * or /.");
            }

            // Add catch to give an optional action if user types in wrong numbers
            } catch (Exception e) {
                System.out.println("Please enter valid numbers.");
                reader.next();
            }

            // Ask if user wants to end program
            System.out.println("Do you want to end program? (yes/no)");
            String answer = reader.next();
            if (answer.equalsIgnoreCase("yes")) {
                keepRunning = false;
                System.out.println("Goodbye!");
            }
            }
        reader.close();
        }
    }