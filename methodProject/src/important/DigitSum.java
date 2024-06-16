package important;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int sum = 0;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
                output.append(digit);
                if (i < input.length() - 1 && Character.isDigit(input.charAt(i + 1))) {
                    output.append("+");
                }
            }
        }
        
        output.append("=").append(sum);
        System.out.println("Output: " + output);
    }
}
