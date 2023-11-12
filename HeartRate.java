import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();

        for (int i = 1; i <= nCases; i++) {
            int b = scanner.nextInt();
            double p = scanner.nextDouble();
            //int t = 60 / b;
            double minABPM = (60 * (b - 1)) / p;
            double BPM = (60 * b)/ p;
            double maxABPM = (60 * (b + 1)) / p;

            System.out.println(minABPM + " " + BPM + " " + maxABPM ); 
        }
    }
}
