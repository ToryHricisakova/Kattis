import java.util.HashSet;
import java.util.Scanner;

public class BeenEverywhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            int numberOfPlacesVisited = scanner.nextInt();
            HashSet<String> numberOfCities = new HashSet<>(); 
            scanner.nextLine();

            for (int j = 0; j < numberOfPlacesVisited; j++) {
                String city = scanner.nextLine();
                numberOfCities.add(city);
            }
        System.out.println(numberOfCities.size());
        } 
    }
}

