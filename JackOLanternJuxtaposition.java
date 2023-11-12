import java.util.Scanner;

public class JackOLanternJuxtaposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eyes = scanner.nextInt();
        int nose = scanner.nextInt();
        int mouth = scanner.nextInt();

        int possibilities = eyes * nose * mouth;
        System.out.println(possibilities);
    }
}
