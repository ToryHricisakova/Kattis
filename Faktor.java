import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfArticles = scanner.nextInt();
        int impactFactor = scanner.nextInt();
        int numberOfBribes;

        numberOfBribes = (impactFactor - 1) * numberOfArticles;
        System.out.println(numberOfBribes + 1);
    }
}
