import java.util.*;

public class BijeleSimplified {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] need = {1,1,2,2,2,8};
        int[] have = new int[6];
        
        for (int i = 0; i < 6; i++) 
        have[i] = scanner.nextInt();
        String s = "" + (need[0] - have[0]);
        
        for (int i = 1; i < 6; i++) 
        s = s + " " + (need[i]-have[i]);
        System.out.println(s);
    }
}
