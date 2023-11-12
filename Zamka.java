import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();

        int N = -1; // Minimal integer
        int M = -1; // Maximal integer

        for (int i = L; i <= D; i++) {
            if (digitSum(i) == X) {
                N = i;
                break;
            }
        }

        for (int i = D; i >= L; i--) {
            if (digitSum(i) == X) {
                M = i;
                break;
            }
        }

        System.out.println(N);
        System.out.println(M);

        scanner.close();
    }

    public static int digitSum(int num) {
        return String.valueOf(num).chars().map(Character::getNumericValue).sum();
    }
}
