import java.util.Scanner;

public class Covid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String positive = "COV";

        if (input.contains(positive)) {
            System.out.println("Veikur!");
        }
        else {
            System.out.println("Ekki veikur!");
        }
    }
}
