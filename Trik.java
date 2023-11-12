import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.next();
        int ballPosition = 1;

        for (char move : moves.toCharArray()) {
            if (move == 'A') {
                if (ballPosition == 1) {
                    ballPosition = 2;
                }
                else if (ballPosition == 2) {
                    ballPosition = 1;
                }
                else if (ballPosition == 3) {
                    ballPosition = 3;
                }
            }

            if (move == 'B') {
                if (ballPosition == 3) {
                    ballPosition = 2;
                }
                else if (ballPosition == 2) {
                    ballPosition = 3;
                }
                else if (ballPosition == 1) {
                    ballPosition = 1;
                }
            }

            if (move == 'C') {
                if (ballPosition == 3) {
                    ballPosition = 1;
                }
                else if (ballPosition == 1) {
                    ballPosition = 3;
                }
                else if (ballPosition == 2) {
                    ballPosition = 2;
                }
            }
        }
        System.out.println(ballPosition);
    }
}
