import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();
        int sumOfNumbers = 0;

        for (int i = 1; i <= nCases; i++) {
            int number = scanner.nextInt();
            sumOfNumbers += number;
        }
        System.out.println(sumOfNumbers);
    }
}
