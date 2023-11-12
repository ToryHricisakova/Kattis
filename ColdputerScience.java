import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTemperatures = scanner.nextInt();
        List<Integer> belowZero = new ArrayList<>();

        for (int i = 1; i <= numberOfTemperatures; i++) {
            int temperature = scanner.nextInt();
            if (temperature < 0) {
                belowZero.add(temperature);
            }  
        }
        System.out.println(belowZero.size());
    }
}
