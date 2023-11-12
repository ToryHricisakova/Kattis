import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();

        if (month.equals("DEC") && day == 25 ||
            month.equals("OCT") && day == 31) {
                System.out.println("yup");
            }
            else System.out.println("nope");

    }
}
