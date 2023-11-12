import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option1SwitchPoints = scanner.nextInt();
        int option2Switchpoints = 100 - option1SwitchPoints;

        // Both versions are correct. DON'T FORGET TO ADD .0 IF YOU'RE 
        // DEALING WITH DOUBLE
        //double output1 =  100.0 / option1SwitchPoints;
        //double output2 = 100.0 / option2Switchpoints;

        double output1 = (1.0 / option1SwitchPoints) * 100.0;
        double output2 = (1.0 / option2Switchpoints) * 100.0;
        
        System.out.println(output1);
        System.out.println(output2);

    }
}
