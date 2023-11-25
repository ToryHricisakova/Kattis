import java.util.Scanner;

public class Flatbokuveisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSlices = scanner.nextInt();
        int people = scanner.nextInt();

        int slicesPerPerson = totalSlices / people;
        int leftOverSlices = totalSlices - (slicesPerPerson * people);
        System.out.println(leftOverSlices);
    }
}
