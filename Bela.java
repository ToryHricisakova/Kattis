import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Bela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHands = scanner.nextInt();
        String dominantHand = scanner.next();
        int points = 0;
        ArrayList<String> cards = new ArrayList<>();

        for (int i = 1; i <= numberOfHands * 4; i++) {
            String card = scanner.next();
            cards.add(card);
        }
        
        for (String card : cards) {
            char value = card.charAt(0);
            char suit = card.charAt(1);

            if (value == 'A') {
                points += 11;
            } else if (value == 'K') {
                points += 4;
            } else if (value == 'Q') {
                points += 3;
            } else if (value == 'T') {
                points += 10;
            } else if (value == '9') {
                points += (suit == dominantHand.charAt(0)) ? 14 : 0;
            } else if (value == 'J') {
                points += (suit == dominantHand.charAt(0)) ? 20 : 2;
            }
        }
        System.out.println(points);
    }
}
