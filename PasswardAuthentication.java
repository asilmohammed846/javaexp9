import java.util.Scanner;

// User-defined exception class
class AuthenticationFailure extends Exception {
    public AuthenticationFailure(String message) {
        super(message);
    }
}

public class PasswordAuthentication {
    // Method to validate password
    public static void validatePassword(String inputPassword, String correctPassword) throws AuthenticationFailure {
        if (!inputPassword.equals(correctPassword)) {
            throw new AuthenticationFailure("Authentication Failed: Incorrect Password");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secure123"; // Hardcoded correct password for demonstration

        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        try {
            validatePassword(userPassword, correctPassword);
            System.out.println("Authentication Successful!");
        } catch (AuthenticationFailure e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
