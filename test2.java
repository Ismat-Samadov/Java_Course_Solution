import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue = 0;

        while (true) {
            System.out.print("Enter an integer value: ");
            if (scanner.hasNextInt()) {
                intValue = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter an integer value.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        System.out.println("You entered: " + intValue);
        // Continue with further processing using the valid integer value
    }
}
