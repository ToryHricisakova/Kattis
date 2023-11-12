import java.util.Scanner;

public class FindingA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int a = input.indexOf('a');

        String suffix = input.substring(a);
        System.out.println(suffix);
    }
}
