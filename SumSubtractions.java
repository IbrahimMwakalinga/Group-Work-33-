import java.util.Scanner;

public class SumSubtractions {
public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean continueProgram = true;
            while (continueProgram) {
                System.out.print("Enter the first number: ");
                double num1 = input.nextDouble();
                
                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();
                
                System.out.println("Choose operation:");
                System.out.println("1. Summation");
                System.out.println("2. Subtraction");
                System.out.println("3. Exit");
                System.out.print("Enter your choice (1, 2, or 3): ");
                int choice = input.nextInt();
                
                double result;
                switch (choice) {
                    case 1 -> {
                        result = num1 + num2;
                        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
                    }
                    case 2 -> {
                        result = num1 - num2;
                        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + result);
                    }
                    case 3 -> {
                        System.out.println("Exiting program...");
                        continueProgram = false;
                    }
                    default -> System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                }
            }
        }
    }    
}