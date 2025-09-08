//13. Take a number and print factorial using do-while.
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return;
        }

        int fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);

        System.out.println("Factorial of " + n + " is " + fact);
    }
}