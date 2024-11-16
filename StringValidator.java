import java.util.Scanner;

// Custom exception class
class InvalidStringException extends Exception {
    public InvalidStringException(String message) {
        super(message);
    }
}

public class StringValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Validate the input string
            if (input.isEmpty()) {
                throw new InvalidStringException("String cannot be empty.");
            }
            if (input.charAt(0) != 's') {
                throw new InvalidStringException("String must start with the character 's'.");
            }

            System.out.println("Valid string: " + input);
        } catch (InvalidStringException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
