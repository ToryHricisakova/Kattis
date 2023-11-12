import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        String stringFirstNumber = Integer.toString(firstNumber); String stringSecondNumber = Integer.toString(secondNumber);

        stringFirstNumber.toCharArray(); stringSecondNumber.toCharArray();

        if (stringFirstNumber.charAt(2) > stringSecondNumber.charAt(2)) {
            output.append(stringFirstNumber);
            output.reverse();
            System.out.println(output);
        }
        else if (stringFirstNumber.charAt(2) == stringSecondNumber.charAt(2)) {

            if (stringFirstNumber.charAt(1) > stringSecondNumber.charAt(1)) {
                output.append(stringFirstNumber);
                output.reverse();
                System.out.println(output);
            }

                else if (stringFirstNumber.charAt(1) == stringSecondNumber.charAt(1)) {
                    
                    if (stringFirstNumber.charAt(0) > stringSecondNumber.charAt(0)) {
                        output.append(stringFirstNumber);
                        output.reverse();
                        System.out.println(output);
                    }
                    else {
                        output.append(stringSecondNumber);
                        output.reverse();
                        System.out.println(output);
                    }
                }

                else {
                    output.append(stringSecondNumber);
                    output.reverse();
                    System.out.println(output);
                }
        }
            
            else {
                output.append(stringSecondNumber);
                output.reverse();
                System.out.println(output);
            }       
    }  
}

