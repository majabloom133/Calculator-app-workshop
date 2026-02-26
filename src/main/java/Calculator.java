import java.util.Scanner;

public class Calculator {

    // Start the program
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // This works as a switch for the loop
        boolean keepRunning = true;

        // Loop will run as long as 'keepRunning' is true
        while (keepRunning) {
            double result = 0;

            // Add try to make sure program doesn't crash if user adds a number that's not valid
            try {
                System.out.println("--- Calculator ---");

                // Ask for first number, ask for operator, ask for second number
                // Use double to make it possible to use decimals
                System.out.print("Enter operator (+, -, *, /): ");
                String operator = reader.next();

                switch (operator) {

            // Add switch
                /* This is the code i replaced
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break; */

                // countAdd line asks how many numbers the user wants to add.
                // Result = 0; - Reset result before starting
                case "+":
                    System.out.print("How many numbers do you want to add? ");
                    int countAdd = reader.nextInt();
                    result = 0;

                    // += means "Add to what we already have"
                    // for line is a loop that will comtinue the number of times the user chose
                    //result += takes the number the user chose, and adds it to the existing sum

                    for (int i = 1; i <= countAdd; i++) {
                        System.out.print("Enter number " + i + ": ");
                        result += reader.nextDouble();
                    }
                    System.out.println("Total Result: " + result);
                    break;

                    case "-":
                        System.out.print("Enter the starting number: ");
                        result = reader.nextDouble();
                    System.out.print("How many numbers do you want to subtract from it? ");
                    int countSub = reader.nextInt();

                    for (int i = 1; i <= countSub; i++) {
                    System.out.print("Enter number to subtract: ");
                    result -= reader.nextDouble();
                    }
                    System.out.println("Total Result: " + result);
                    break;

                    // This is the original code for subtraction
               /* case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break; */

                    case "*":
                        System.out.print("Enter your first number: ");
                                double m1 = reader.nextDouble();
                        System.out.print("Enter your second number: ");
                        double m2 = reader.nextDouble();

                        result = m1 * m2;
                        System.out.println("Result: " + result);
                        break;

                    case "/":
                        System.out.print("Enter your first number: ");
                        double d1 = reader.nextDouble();
                        System.out.print("Enter your second number: ");
                        double d2 = reader.nextDouble();

                        if (d2 != 0) {
                            result = d1 / d2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");

                        }
                        break;

                        // Since I changed  to a loop that makes user choose how many numbers they want to add, i updated the code for + and -, will now do the same for * and /
/* This is the old code
                    case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
 */
               /* Old code
               case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break; */

                    // This message will appear if user uses another operator/sign than +, -, * or /
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
                // Exits loop
                keepRunning = false;
                System.out.println("Goodbye!");
            }
            }

        // Closes scanner to save computer resources
        reader.close();
        }
    }