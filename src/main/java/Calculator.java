import java.util.Scanner;

public class Calculator {

    // Start the program
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("--- Calculator ---");

            // This is where I will add the math

            // Ask if user wants to end program
            System.out.println("Do you want to end program? (yes/no)");
            String answer = reader.next();
            if (answer.equalsIgnoreCase("yes")) {
                keepRunning = false;
                System.out.println("Goodbye!");
            }
            }

        }
    }