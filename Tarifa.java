import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int megabytes = scanner.nextInt();
        int months = scanner.nextInt();
        int output = 0;

        for (int i = 1; i <= months; i++) {
            int megabytesSpent = scanner.nextInt();
            if (megabytesSpent < megabytes) {
                output += megabytes - megabytesSpent;
            }
            else if (megabytesSpent > megabytes) {
                output -= megabytesSpent - megabytes;
            }
        }
        System.out.println(output + megabytes);
    }
}
