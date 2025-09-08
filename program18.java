//18. Take a string input and print characters one by one, but stop when a space is found.
import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}