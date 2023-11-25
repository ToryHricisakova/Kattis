import java.util.Scanner;

public class ÁLeiðíBíó {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int travelTime = a + b;

        int output = c - travelTime;
        System.out.println(output);
    }
}
