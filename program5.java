//5. Write a program to calculate the square and cube of a number using the * operator.
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int cube = n * n * n;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }
}