import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfJavelins = scanner.nextInt();
        int output = 0;

        for (int i = 0; i < numberOfJavelins; i++) {
            int javelinLength = scanner.nextInt();
            output += javelinLength;
        }
        
        output -= numberOfJavelins - 1;
        System.out.println(output);
    }
}
