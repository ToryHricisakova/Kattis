import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int i = 0;
        while (i < number) {
            String word = scanner.next();
            if (i % 2 == 0) 
            System.out.println(word);
            i++;
        }    
       
        
        
        //String word = scanner.next();
        //String word1 = scanner.next();
        //String word2 = scanner.next();
        //String word3 = scanner.next();
        //String word4 = scanner.next();
        
        //System.out.println(word);
        //System.out.println(word2);
        //System.out.println(word4);
    }
    
}
