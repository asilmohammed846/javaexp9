import java.util.Scanner;

// Custom exception class
class NotEvenNumberException extends Exception {
    public NotEvenNumberException(String message) {
        super(message);
    }
}

public class EvenNumberChecker {
    // Method to check if a number is even
    public static void checkEven(int number) throws NotEvenNumberException {
        if (number % 2 != 0) {
            throw new NotEvenNumberException("The number " + number + " is not even!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is even
            checkEven(number);

            System.out.println("The number " + number + " is even.");
        } catch (NotEvenNumberException e) {
            // Handle the custom exception
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handle other potential exceptions (e.g., input mismatch)
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
