import java.util.Scanner;
 class OddNumberException {
    public OddNumberException(){
	System.out.println("ODD NUMBER EXC");
	}
    
}

public class EvenNumberChecker {
    
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is not even!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        try {
            checkEven(number);
            System.out.println("The number " + number + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}