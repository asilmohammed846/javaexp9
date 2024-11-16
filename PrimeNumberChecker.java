import java.util.Scanner;

// User-defined exception class
class NotPrimeException extends Exception {
    public NotPrimeException(String message) {
        super(message);
    }
}

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept a number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is prime
            if (!isPrime(number)) {
                throw new NotPrimeException("The number " + number + " is not a prime number.");
            }

            // If no exception, print success message
            System.out.println("The number " + number + " is a prime number.");
        } catch (NotPrimeException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., invalid input)
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
