/**
*Author - Brian Ho
*This program gets a String input from the user and repeats each individual character an amount of times based on its position (index)
*EG: String - apples /// result - pppllleeeesssss
*/

import java.util.Scanner;	//import Scanner class

public class Lab07b {
	static Scanner user_input = new Scanner(System.in);	//new static scanner constructor, static so that can be used by multiple static methods
	
public static String expandString(String input) { 		//method to expand the String and repeat its characters. gets a string input as a parameter
	StringBuilder result = new StringBuilder();			//new StringBuilder variable named result, initialized as blank, which gets returned in the end
		for (int i = 0; i < input.length(); i++) {		//for loop, creates i variable and initializes as 0. loop goes through each character (index) in the user's String, up to the end of it
			for (int j = 0; j < i; j++) {				//for loop, creates j variable and initializes as 0. loop increments for as many times as i's current counter. basically the amount of outputs is the index of i
			result = result.append(input.charAt(i));	//append to the result StringBuilder whatever character is at the current index of i, for j number of times
			}											//EG: first character in String will be appended 0 number of times (its index, 0), second character in String will be appended 1 time (its index, 1), etc
		}
		return result.toString();		//after running through all indexes and for loop ends, convert result to a string and return it for main method to display
}	

public static void main(String[] args) {	//main method
 		char r = 'y';	//variable for repeat condition	
		do {
		System.out.println("");
		System.out.println("Input text here. The program will expand text based on its character position.");	//instructional text
		String userString = user_input.nextLine();	//gets user input and creates a new String variable named userString. its value is assigned to the user's input
		System.out.println(expandString(userString));	//passes the user's String input as a parameter for the expandString method to use. displays the result after
 		System.out.println("");
		System.out.println ("Try again? y/n ");	//prompt for program to loop
		r = user_input.nextLine().charAt(0);	//gets user input and depending on their input (y or other), determines if the program will loop or not
		} while (r=='y' || r=='Y');	//while r variable is 'y', loop to the beginning, prompting for another String input
	}
}


