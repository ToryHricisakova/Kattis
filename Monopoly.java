import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numberOfHotels = scanner.nextInt();

        int[] hotelDistance = new int[numberOfHotels];
        for (int i = 0; i < numberOfHotels; i++) {
            hotelDistance[i] = scanner.nextInt();
        }
        

        for (int dice1 = 1; dice1 <= 6; dice1++) {
            for (int dice2 = 1; dice2 <= 6; dice2++) {
                int sum = dice1 + dice2;
                for (int distance : hotelDistance) {
                    if (sum == distance) {
                        count++;
                        break;
                    }
            }
        }
    }

    double probability = (double) count / 36;
    System.out.println(probability);
    }
}
