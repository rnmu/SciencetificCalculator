import java.util.Scanner;
import java.util.InputMismatchException;
public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        boolean running = true;

        // Main loop to keep the calculator running until user exits
        while (running) {
            displayMenu(); // Show all available operations

            try {
                // User options
                System.out.print("Choose an option (1–18): ");
                int option = inputReader.nextInt();

                // switch statement
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
                    case 8:
                        performCosine(inputReader);
                        break;
                    case 9:
                        performTangent(inputReader);
                        break;
                    case 10:
                        performNaturalLog(inputReader);
                        break;
                    case 11:
                        performLogBase10(inputReader);
                        break;
                    case 12:
                        performAbsoluteValue(inputReader);
                        break;
                    case 13:
                        performRounding(inputReader);
                        break;
                    case 14:
                        performCeiling(inputReader);
                        break;
                    case 15:
                        performFloor(inputReader);
                        break;
                    case 16:
                        performMinimum(inputReader);
                        break;
                    case 17:
                        performMaximum(inputReader);
                        break;
                    case 18:
                        System.out.println("Exiting calculator. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                // Handle input errors
                System.out.println("Invalid input. Please enter numbers only.");
                inputReader.nextLine();
            }
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
        System.out.println("12. Absolute value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum");
        System.out.println("17. Maximum");
        System.out.println("18. Exit");
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
    public static double calculateCosine(double degrees) {

        return Math.cos(Math.toRadians(degrees));
    }
    public static double calculateTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.abs(Math.cos(radians)) < 1e-10 ? Double.NaN : Math.tan(radians);
    }
    public static double calculateNaturalLog(double num) {
        return (num <= 0) ? Double.NaN : Math.log(num);
    }
    public static double calculateLogBase10(double num) {
        return (num <= 0) ? Double.NaN : Math.log10(num);
    }

    private static double calculateAbsoluteValue(double num) {
        return Math.abs(num);
    }
    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }
    public static double findMin(double a, double b) {
        return Math.min(a, b);
    }

    public static double findMax(double a, double b) {
        return Math.max(a, b);
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
    private static void performCosine(Scanner inputReader) {
        System.out.print("Enter angle in degrees: ");
        double angle = inputReader.nextDouble();
        System.out.println("Result: " + calculateCosine(angle));
    }
    private static void performTangent(Scanner inputReader) {
        System.out.print("Enter angle in degrees: ");
        double angle = inputReader.nextDouble();
        System.out.println("Result: " + calculateTangent(angle));
    }
    private static void performNaturalLog(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();
        System.out.println("Result: " + calculateNaturalLog(num));
    }
    private static void performLogBase10(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();
        System.out.println("Result: " + calculateLogBase10(num));
    }
    private static void performAbsoluteValue(Scanner inputReader) {
        System.out.print("Enter a number to get its absolute value: ");
        double num = inputReader.nextDouble();
        double result = calculateAbsoluteValue(num);
        System.out.println("Result: " + result);
    }

    private static void performRounding(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();
        System.out.println("Result: " + roundNumber(num));
    }

    private static void performCeiling(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();
        System.out.println("Result: " + ceilingNumber(num));
    }

    private static void performFloor(Scanner inputReader) {
        System.out.print("Enter number: ");
        double num = inputReader.nextDouble();
        System.out.println("Result: " + floorNumber(num));
    }
    private static void performMinimum(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();
        System.out.println("Minimum: " + findMin(a, b));
    }

    private static void performMaximum(Scanner inputReader) {
        System.out.print("Enter first number: ");
        double a = inputReader.nextDouble();

        System.out.print("Enter second number: ");
        double b = inputReader.nextDouble();
        System.out.println("Maximum: " + findMax(a, b));
    }
}


