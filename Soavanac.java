import java.util.Scanner;

public class Soavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputH = scanner.nextInt();
        int inputM = scanner.nextInt();

        int outputM = inputM - 45;
        int outputH = inputH;

        if (inputM < 45) {
            outputH = inputH -1;
            int leftoverM = 45 - inputM;
            outputM = 60 - leftoverM;
        }

        if (inputH == 0) {
            outputH = 23;
            int leftoverM = 45 - inputM;
            outputM = 60 - leftoverM;
        }

        System.out.println(outputH + " " + outputM);
    }
}
