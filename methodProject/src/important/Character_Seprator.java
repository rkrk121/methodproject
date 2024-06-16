package important;
import java.util.Scanner;
                                                      //input:aAbBcC123@#         output:ABC abc 123 @#
public class Character_Seprator 
{
	    public static void main(String [] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	         String input = scanner.nextLine();

	        StringBuilder uppercase = new StringBuilder();
	        StringBuilder lowercase = new StringBuilder();
	        StringBuilder digits = new StringBuilder();
	        StringBuilder specialChars = new StringBuilder();

	        // Separating characters into groups
	        for (char c : input.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                uppercase.append(c);
	            } else if (Character.isLowerCase(c)) {
	                lowercase.append(c);
	            } else if (Character.isDigit(c)) {
	                digits.append(c);
	            } else {
	                specialChars.append(c);
	            }
	        }

	        // Printing the groups
	        System.out.println("Uppercase letters: " + uppercase);
	        System.out.println("Lowercase letters: " + lowercase);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special characters: " + specialChars);
	    }
	}


