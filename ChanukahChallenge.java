import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDataSets = scanner.nextInt();
        
        for (int i = 1; i <= numberOfDataSets; i++) {
        int day = scanner.nextInt();
        int numberOfDays = scanner.nextInt();

        int totalCandles = numberOfDays + (numberOfDays * (numberOfDays + 1) / 2);
        System.out.println(day + " " + totalCandles);
        }

    }
}
