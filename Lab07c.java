/**
*Author - Brian Ho
*This program gets a String and integer input from the user, and then deletes a character in the index of the String corresponding to the integer.
*EG: String - apples /// int - 3 /// result - appes 
*
*NOTE: originally, String del was int del, and parseInt wasn't needed. However, for some reason, 
*using int caused the program to not loop properly (when it reached the end of the program the first time and looped back to
*a new string input, it would skip the scanner for a new string input and be infinitely stuck in the del input prompt)  
*/

import java.util.Scanner;	//import Scanner class

public class Lab07c {
	static Scanner user_input = new Scanner(System.in);	//new static scanner constructor, static so that can be used by multiple static methods

    public static void main(String[] args) {	//main method
	 	char r = 'y'; 	//variable for repeat condition
			do {	//do/while loop encompassing user entering a string and modifying their string
			System.out.println("Enter a string here. Enter nothing to quit.");
			StringBuilder userString = new StringBuilder(user_input.nextLine());	//creates a new StringBuilder object with a value set to the user's input
			if (userString.toString().equals("")){	//if user enters a blank string, set r (repeat) variable to 'n', proceeding to the end of the do/while loop
				r='n';								//and ending the program. toString is used here to convert and compare the input to "" (blank), because StringBuilder can't
			} else {	
				do {	//do/while loop which incorporates deleting characters in a loop until the string is empty
				System.out.println("Delete which character? Enter -1 to create a new string.");	//instructional text
				System.out.println("Current string: " + userString);
				String del = user_input.nextLine(); //creates new variable intended for user's input of which index to delete
				if (Integer.parseInt(del) < 0) {					//Integer.parseInt converts user's String input into an integer for the program to use. If del is less than 0
					userString.delete(0, userString.length());		//if del is less than 0, delete the String from index 0 up to the end of the String (effectively deleting the String)
																	//this fulfills the condition to exit the deleting loop and go back to creating a new String
				} else if (Integer.parseInt(del) >= 0 && Integer.parseInt(del) < userString.length()) {		//if del input is between 0 and up to the end of the String,
					System.out.println(userString.deleteCharAt(Integer.parseInt(del)));						//delete the character at that index
				} else {	//else condition would be if the del input was an index past the end of the String
					System.out.println("Please input a lower number.");	//in this case, display instructional text to user, String remains unchanged
				} 
				} while (userString.length() > 0);	//through the modifications in the if statments above, if the String's length is at least 1 or more, 
			}										//loop to delete input prompt, using the new modified string
		} while (r=='y' || r=='Y');	//while r variable is 'y', loop to the beginning, prompting for another input for del
	}
}