import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfAtBats = scanner.nextInt();
        int totalAtBats = 0;
        int successfulAtBats = 0;

        for (int i = 1; i <= numberOfAtBats; i++) {
            int atBat = scanner.nextInt();

            if (atBat != -1) {
                totalAtBats += atBat;
                successfulAtBats ++;
            }
        }
        double output = (double) totalAtBats / successfulAtBats;
        System.out.println(output);
    }
}
