import java.util.Scanner;

public class Heey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder("h");

        for (int i = 1; i < input.length() -1; i++) {
            if (input.charAt(i) == 'e') {
                output.append("ee");
            }
                else {
                    output.append(input.charAt(i));
                }
        }
        output.append("y");
        System.out.println(output);

    }

}