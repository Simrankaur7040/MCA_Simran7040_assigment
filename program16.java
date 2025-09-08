//16. Print numbers from 1 to 10, but stop at 7 using break.
public class program16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}