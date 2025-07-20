import java.util.Scanner;
import java.util.InputMismatchException;
public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu(); // Display menu


                // User options
                System.out.print("Choose an option (1–17): ");
                int option = inputReader.nextInt();


                switch (option) {
                    case 1:
                        performAddition(inputReader);
                        break;
                    case 2:
                        performSubtraction(inputReader);
                        break;
                    case 3:
                        performMultiplication(inputReader);
                        break;
                    case 4:
                        performDivision(inputReader);
                        break;
                    case 5:
                        performSquareRoot(inputReader);
                        break;
                    case 6:
                        performPower(inputReader);
                        break;
                    case 7:
                        performSine(inputReader);
                        break;
                    case 17:
                        System.out.println("Exiting calculator. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }


                inputReader.nextLine();

        }

        // Close scanner
        inputReader.close();
    }

    // --- Menu Display Method ---
    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1.  Add");
        System.out.println("2.  Subtract");
        System.out.println("3.  Multiply");
        System.out.println("4.  Divide");
        System.out.println("5.  Square Root");
        System.out.println("6.  Power (x^y)");
        System.out.println("7.  Sine");
        System.out.println("8.  Cosine");
        System.out.println("9.  Tangent");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Log Base 10");
        System.out.println("12. Round");
        System.out.println("13. Ceiling");
        System.out.println("14. Floor");
        System.out.println("15. Minimum");
        System.out.println("16. Maximum");
        System.out.println("17. Exit");
    }

    // --- Basic Arithmetic Methods ---
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    // --- Scientific Math Methods ---
    public static double calculateSquareRoot(double num) {
        return (num < 0) ? Double.NaN : Math.sqrt(num);
    }
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    // --- Helper Methods for User Interaction ---
    private static void performAddition(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();

        System.out.println("Result: " + add(a, b));
    }
    private static void performSubtraction(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();

        System.out.println("Result: " + subtract(a, b));
    }
    private static void performMultiplication(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();

        System.out.println("Result: " + multiply(a, b));
    }
    private static void performDivision(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Result: " + divide(a, b));
        }
    }
    private static void performSquareRoot(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();

        System.out.println("Result: " + calculateSquareRoot(num));
    }
    private static void performPower(Scanner inputReader) {
        System.out.print("Enter base: ");
        double base = inputReader.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = inputReader.nextDouble();

        System.out.println("Result: " + calculatePower(base, exponent));
    }
    private static void performSine(Scanner inputReader) {
        System.out.print("Enter angle in degrees: ");
        double angle = inputReader.nextDouble();
        System.out.println("Result: " + calculateSine(angle));
    }

}


