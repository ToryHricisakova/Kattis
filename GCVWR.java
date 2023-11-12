import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gcvwr = scanner.nextInt();
        int weightOfTruck = scanner.nextInt();
        int campingItems = scanner.nextInt();
        int totalWeightOfItems = 0;

        for (int i = 1; i <= campingItems; i++) {
            int weightOfItem = scanner.nextInt();
            totalWeightOfItems += weightOfItem;
        }

        double output = ((gcvwr - weightOfTruck) * 0.9) - totalWeightOfItems;
        int intoutput = (int) Math.round(output);
        System.out.println(intoutput);
    }
}
