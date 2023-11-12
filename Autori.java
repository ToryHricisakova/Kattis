import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder initials = new StringBuilder();
        initials.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                initials.append(input.charAt(i + 1));
            }
        }    

        System.out.println(initials);
    }
}

