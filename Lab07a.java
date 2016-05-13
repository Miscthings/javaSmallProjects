/**
*Author - Brian Ho
*This program gets a String input from the user and removes all spaces between words.
*EG: String - apples are red /// result - applesarered 
*/

import java.util.Scanner;	//import Scanner class

public class Lab07a {
	static Scanner user_input = new Scanner(System.in); //new static scanner constructor, static so that can be used by multiple static methods
	
public static String removeSpaces(String input) {	//method to remove spaces. gets a string input as a parameter
	StringBuilder result = new StringBuilder();		//new StringBuilder variable named result, initialized as blank, which gets returned in the end
 		for (int i = 0; i < input.length(); i++) {	//for loop, creates i variable and initializes as 0. loop goes through each character (index) in the user's String, up to the end of it
			if (input.charAt(i) != ' ') {					//if the current character at i index is not a blank space, append it to the result StringBuilder. this effectively removes
				result = result.append(input.charAt(i));	//spaces from the user's String because if the program does find a space, it won't append it to result
			}
		}
		return result.toString();	//after running through all indexes and for loop ends, convert result to a string and return it for main method to display
	}
	
public static void main(String[] args) {	//main method
		char r = 'y';	//variable for repeat condition
		do {
		System.out.println("");
		System.out.println("Please type a sentence. The program will remove any spaces.");	//instructional text
		String userString = user_input.nextLine();	//gets user input and creates a new String variable named userString. its value is assigned to the user's input
		System.out.println(removeSpaces(userString)); //passes the user's String input as a parameter for the removeSpaces method to use. displays the result after
		System.out.println("");
		System.out.println ("Try again? y/n ");	//prompt for program to loop
		r = user_input.nextLine().charAt(0);	//gets user input and depending on their input (y or other), determines if the program will loop or not
		} while (r=='y' || r=='Y');	//while r variable is 'y', loop to the beginning, prompting for another String input
	}
}


