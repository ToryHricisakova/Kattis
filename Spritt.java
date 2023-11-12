import java.util.Scanner;

public class Spritt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfClassrooms = scanner.nextInt();
        int sanitazersAvailable = scanner.nextInt();
        int output = 0;

        for (int i = 1; i <= numberOfClassrooms; i++) {
            int sanitazersNeededForOneClassroom = scanner.nextInt();
            output += sanitazersNeededForOneClassroom;
        }

        if (output > sanitazersAvailable) {
            System.out.println("Neibb");
        }
            else {
                System.out.println("Jebb");
                }
    }
}
