import java.util.Scanner;

public class Umferð {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCells = scanner.nextInt();
        int numberOfLanes = scanner.nextInt();
        int unoccupiedCount = 0;

        for (int i = 1; i <= numberOfLanes; i++) {
            String cellStatus = scanner.next();
            for (int j = 0; j < cellStatus.length(); j++) {
                if (cellStatus.charAt(j) == '.') unoccupiedCount++;
            }
        }
        double output = ((double) unoccupiedCount / (numberOfCells * numberOfLanes));
        System.out.println(output);
    }
}
