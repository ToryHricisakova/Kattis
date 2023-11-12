import java.util.Scanner;

public class QUALY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeriods = scanner.nextInt();
        double qualy = 0.0;

        for (int i = 0; i < numberOfPeriods; i++) {
            double qualityOfLife = scanner.nextDouble();
            double year = scanner.nextDouble();
            qualy += (qualityOfLife * year);
        } 

        System.out.println(qualy);

    }
}
