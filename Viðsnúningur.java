import java.util.Scanner;

public class Hebrew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = reverseInput(input);
        System.out.println(output);
    }

    private static String reverseInput(String input) {
        StringBuilder output = new StringBuilder(input);
            output.reverse();
            return output.toString();
    }
}