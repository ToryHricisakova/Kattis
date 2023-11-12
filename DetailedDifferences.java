import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        scanner.nextLine();  /* if the input is taking a the line the one that has the 
        integer in it alrady, you have to go to the other line with scanner.nextLine(); */

        for (int i = 0; i < numberOfInputs; i++) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            System.out.println(input1);
            System.out.println(input2);

            StringBuilder output = new StringBuilder();

            for (int j = 0; j < input1.length(); j++) {

                if (input1.charAt(j) == input2.charAt(j)) {
                    output.append(".");
            }
                else {
                    output.append("*");
                }
            }
            System.out.println(output);
            System.out.println();
        }
    }
}
