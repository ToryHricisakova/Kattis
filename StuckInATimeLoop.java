import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}