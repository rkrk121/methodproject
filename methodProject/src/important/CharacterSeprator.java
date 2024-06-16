package important;
import java.util.Scanner;

public class CharacterSeprator                              //input:aAbBcC123    output:abc
                                                                                  //    ABC
                                                                                  //    123                                                                       
{
	    public static void main(String [] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        StringBuilder uppercase = new StringBuilder();
	        StringBuilder lowercase = new StringBuilder();
	        StringBuilder digits = new StringBuilder();

	        // Separating characters into groups
	        for (char c : input.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                uppercase.append(c);
	            } else if (Character.isLowerCase(c)) {
	                lowercase.append(c);
	            } else if (Character.isDigit(c)) {
	                digits.append(c);
	            }
	        }

	        // Printing the groups
	        System.out.println("Uppercase letters: " + uppercase);
	        System.out.println("Lowercase letters: " + lowercase);
	        System.out.println("Digits: " + digits);
	    }
	}


