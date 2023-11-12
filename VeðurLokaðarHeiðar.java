import java.util.Scanner;

public class VedurLokadarHeidar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentWindSpeed = scanner.nextInt();
        int numberOfRoads = scanner.nextInt();

        for (int i = 1; i <= numberOfRoads; i++) {
            String roadName = scanner.next();
            int maxSafeWindSpeed = scanner.nextInt();

            if (maxSafeWindSpeed >= currentWindSpeed) {
                System.out.println(roadName + " opin");
            }
            else if (maxSafeWindSpeed < currentWindSpeed) {
                System.out.println(roadName + " lokud");
            }
        }
    }
}
