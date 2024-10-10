public class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            // Attempt to divide by zero
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException that occurs when dividing by zero
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // Code in the finally block will always execute, whether an exception occurs or not
            System.out.println("Division attempt completed.");
        }
    }
}