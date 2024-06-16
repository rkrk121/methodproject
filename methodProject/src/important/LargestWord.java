package important;

public class LargestWord {
    public static void main(String[] args) {
        String input = "My name is rahul"; // Input string
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Initialize variables to store the longest word and its length
        String largestWord = "";
        int maxLength = 0;
        
        // Iterate through each word in the array
        for (String word : words) {
            // If the current word is longer than the previous longest word, update largestWord and maxLength
            if (word.length() > maxLength) {
                largestWord = word;
                maxLength = word.length();
            }
        }
        
        // Print the longest word
        System.out.println("Output: " + largestWord);
    }
}