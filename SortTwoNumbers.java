import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x < y) {
            System.out.println(x + " " + y);
        }
            else if (y < x) {
                System.out.println(y + " " + x);
            }
            else {
                System.out.println(x + " " + y);
            }
    }
}
