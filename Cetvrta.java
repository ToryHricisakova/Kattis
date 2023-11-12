import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d1;
        int d2;

        if (a1 == b1) {
            d1 = c1;
        } else if (a1 == c1) {
            d1 = b1;
        } else {
            d1 = a1;
        }

        if (a2 == b2) {
            d2 = c2;
        } else if (a2 == c2) {
            d2 = b2;
        } else {
            d2 = a2;
        }
        System.out.println(d1 + " " + d2);
    }
}
