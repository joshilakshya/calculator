//Calculator.java


import java.util.Scanner;
import Operations.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                sc.next(); // clear the buffer
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        Addition.perform(sc);
                        break;
                    case 2:
                        Subtraction.perform(sc);
                        break;
                    case 3:
                        Multiplication.perform(sc);
                        break;
                    case 4:
                        Division.perform(sc);
                        break;
                    case 5:
                        Square.perform(sc);
                        break;
                    case 6:
                        Cube.perform(sc);
                        break;
                    case 7:
                        SquareRoot.perform(sc);
                        break;
                    case 8:
                        keepRunning = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 8.");
                }
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic Error: " + ae.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
