package important;
import java.util.Scanner;

public class CharacterRepeater                              //input:a1a1b2b2c4-------------output:aabbcccc
{
	    public static void main(String [] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        StringBuilder output = new StringBuilder();

	        // Iterate through the string
	        for (int i = 0; i < input.length(); i += 2) {
	            char character = input.charAt(i);
	            int count = Character.getNumericValue(input.charAt(i + 1));
	            // Repeat the character based on the count
	            for (int j = 0; j < count; j++) {
	                output.append(character);
	            }
	        }

	        System.out.println("Output: " + output.toString());
	    }
	}


