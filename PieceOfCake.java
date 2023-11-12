import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        int biggestPieceH;
        int biggestPieceV;
        
        if ((n - h) > h) biggestPieceH = n-h;
        else biggestPieceH = h;

        if ((n - v) > v) biggestPieceV = n-v;
        else biggestPieceV = v;

        int biggestPiece = biggestPieceH * biggestPieceV * 4;
        System.out.println(biggestPiece);
    }
}
