import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costOfSeedPerSqm = scanner.nextDouble();
        int numberOfLawns = scanner.nextInt();
        double priceTotal = 0;

        for (int i = 1; i <= numberOfLawns; i++) {
            double lawnWidth = scanner.nextDouble();
            double lawnLength = scanner.nextDouble();
            double pricePerLawn = lawnWidth * lawnLength * costOfSeedPerSqm;
            priceTotal += pricePerLawn;
        }
        System.out.println(priceTotal);
    }
}
