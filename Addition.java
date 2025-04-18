//Addition.java

package Operations;
import java.util.Scanner;

public class Addition {
    public static void perform(Scanner sc) {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double result = a + b;
        System.out.println("Result = " + result);
    }
}
