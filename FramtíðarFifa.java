import java.util.Scanner;

public class FramtíðarFifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
    
        int y = n/k;
        int currentYear = 2023 + y - 1;

        System.out.println(currentYear);
    }
    
}
