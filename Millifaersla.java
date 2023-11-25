import java.util.Scanner;

public class Millifaersla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b < a && b < c) System.out.println("Fjee");
        else if (c < a && c < b) System.out.println("Dolladollabilljoll");
        else if (a < b && a < c) System.out.println("Monnei");

    }
}
