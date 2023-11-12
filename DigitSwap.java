import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char a = input.charAt(0);
        char b = input.charAt(1);

        String output = b + "" + a;
        System.out.println(output);
    }
}
