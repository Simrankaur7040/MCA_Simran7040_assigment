//10. Take an integer and check whether it is divisible by both 3 and 5 using a ternary operator.
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        String result = (n % 3 == 0 && n % 5 == 0) ? "Divisible by both 3 and 5" : "Not divisible by both 3 and 5";
        System.out.println(result);
    }
}
