import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputX = scanner.nextInt();
        int inputY = scanner.nextInt();

        int output = inputX + inputY;
        System.out.println(output);
    }
}
