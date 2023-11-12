import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            int revenueWithoutAd = scanner.nextInt();
            int revenueWithAd = scanner.nextInt();
            int costOfAd = scanner.nextInt();

            if (revenueWithAd - costOfAd > revenueWithoutAd) {
                System.out.println("advertise");
            }
            else if (revenueWithAd - costOfAd < revenueWithoutAd) {
                System.out.println("do not advertise");
            }
            else {
                System.out.println("does not matter");
            }
        }
    }
}
