import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();

        for (int i = 0; i < numberOfNumbers; i++) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            }
            else {
                System.out.println(number + " is odd");
            } 
        }
    }
}
