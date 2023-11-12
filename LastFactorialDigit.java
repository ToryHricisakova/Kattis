import java.util.Scanner;

public class LastFactorialDigit {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        
        int n = scanner.nextInt();

        for (int i = 1; i <= n;i++) {
            int factorial = 1;
            int N = scanner.nextInt();

            for (int j = 1; j <= N ;j++){
            factorial = j * factorial;
                
            }
            int lastDigit = factorial % 10;
            System.out.println(lastDigit);
  
        }
      
    
    }}