import java.util.Scanner;

public class Apaxians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longName = scanner.nextLine();
        StringBuilder shortenedName = new StringBuilder();

        for (int i = 0; i < longName.length(); i++) {
            char currentChar = longName.charAt(i);

            if (shortenedName.length() == 0 || currentChar != shortenedName.charAt(shortenedName.length() - 1)) {
                shortenedName.append(currentChar);
            }
        }
        System.out.println(shortenedName.toString());
    }
}
