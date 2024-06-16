package important;

public class OnlyNumberSum {
    public static void main(String[] args) {
        String input = "Rahul1235"; // Input string
        int sum = 0; // Initialize sum to zero
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the digit character to its numeric value and add to the sum
                sum += Character.getNumericValue(ch);
            }
        }
        
        // Print the sum
        System.out.println("Output: " + sum);
    }
}