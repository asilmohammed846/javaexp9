import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate the entered age
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative.");
            }

            System.out.println("Your age is: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
