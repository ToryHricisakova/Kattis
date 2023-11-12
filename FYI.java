import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.charAt(0) == '5' && 
            input.charAt(1) == '5' && 
            input.charAt(2) == '5') {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
    }
}
