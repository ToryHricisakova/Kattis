import java.util.Scanner;

public class Metronome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfSong = scanner.nextInt();
        
        double numberOfRevolutions = lengthOfSong / 4.0;

        System.out.println(numberOfRevolutions);
    }
}
