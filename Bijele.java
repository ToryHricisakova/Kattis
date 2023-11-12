import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputKing = scanner.nextInt();
        int inputQueen = scanner.nextInt();
        int inputRooks = scanner.nextInt();
        int inputBishops = scanner.nextInt();
        int inputKnights = scanner.nextInt();
        int inputPawns = scanner.nextInt();
        int outputKing;
        int outputQueen;
        int outputRooks;
        int outputBishops;
        int outputKnights;
        int outputPawns;

        if (inputKing < 1) {
            outputKing = 1 - inputKing;
        }
            else if (inputKing > 1) {
            outputKing = 1 - inputKing;
            }
                else {
                    outputKing = 0;
                }

        if (inputQueen < 1) {
            outputQueen = 1 - inputQueen;
        }
            else if (inputKing > 1) {
            outputQueen = 1 - inputQueen;
            }
                else {
                    outputQueen = 0;
                }

        if (inputRooks < 2) {
            outputRooks = 2 - inputRooks;
        }
            else if (inputRooks > 2) {
            outputRooks = 2 - inputRooks;
            }
                else {
                    outputRooks = 0;
                }

        if (inputBishops < 2) {
            outputBishops = 2 - inputBishops;
        }
            else if (inputRooks > 2) {
            outputBishops = 2 - inputBishops;
            }
                else {
                    outputBishops = 0;
                }

        if (inputKnights < 2) {
            outputKnights = 2 - inputKnights;
        }
            else if (inputRooks > 2) {
            outputKnights = 2 - inputKnights;
            }
                else {
                    outputKnights = 0;
                }

         if (inputPawns < 8) {
            outputPawns = 8 - inputPawns;
        }
            else if (inputRooks > 8) {
            outputPawns = 8 - inputPawns;
            }
                else {
                    outputPawns = 0;
                }

        System.out.println(outputKing + " " + outputQueen + " " + outputRooks + " " + outputBishops + " " + outputKnights + " " + outputPawns);
    }
}
