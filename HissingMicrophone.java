import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.next();

        boolean foundHiss = false;
        for (int i = 0; i < inputWord.length()-1; i++) {
            if (inputWord.charAt(i) == 's' && inputWord.charAt(i + 1) == 's') {
                foundHiss = true;
                break;
            }
        }
        if (foundHiss) {
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}
