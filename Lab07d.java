/**
*Author - Brian Ho
*This program gets two String inputs from a user and uses the second String to delete from the first one.
*EG: 1st - apples /// 2nd - ple /// result - aps 
*/

import java.util.Scanner;	//import Scanner class

public class Lab07d {
	static Scanner user_input = new Scanner(System.in);	//new static scanner constructor, static so that can be used by multiple static methods

    public static void main(String[] args) {	//main method
	 	char r = 'y'; 	//variable for repeat condition
		
			do {	//do/while loop encompassing user entering a string and modifying their string
			System.out.println("");
			System.out.println("Enter a string here. Enter nothing to quit.");
			StringBuilder userString = new StringBuilder(user_input.nextLine());	//creates a new StringBuilder object with a value set to the user's input
			if (userString.toString().equals("")){	//if user enters a blank string, set r (repeat) variable to 'n', proceeding to the end of the do/while loop
				r='n';								//and ending the program. toString is used here to convert and compare the input to "" (blank), because StringBuilder can't
			} else {	
				do {	//do/while loop which incorporates deleting characters in a loop until the string is empty
				System.out.println("");
				System.out.println("Enter a sequential string to delete.");	//instructional text
				System.out.println("*Enter new123 to create a new string.");
				System.out.println("*Enter recall to display the current string.");
				String del = user_input.nextLine(); //creates new variable intended for user's input of which character(s) to delete
				int index = userString.indexOf(del); //index variable created here to find out what index the user's del input was at in relation to the String
				if (del.equals("recall")) {							//if user inputs "recall", program will display the String in its current state
					System.out.println("The current string is " + userString);
				} else if (del.equals("new123")) {					//if user inputs "new123", program will delete the String from index 0 up to the end of the String (effectively deleting the String)
					userString.delete(0, userString.length());		//this fulfills the condition to exit the deleting loop and go back to creating a new String
				} else if (userString.toString().contains(del) == false) {		//if user inputs characters that are out of sequence or don't exist in the String, display instructional text, String remains unchanged
					System.out.println("Your string does not contain " + del + ". Make sure your input is case-sensitive.");
				} else {	//else condition would be that del value is valid and exists within the String, in which case it proceeds to delete it from the String
					System.out.println("");
					System.out.println("Old string: " + userString);	//text to display old and new Strings, so user can see what was deleted
					System.out.println("Deleting: " + del);
					System.out.println("New string: " + userString.delete(index, del.length() + index));		//finds the index of user's del input in String, and then how many characters long the del
				} 																								//input is. deletes that many characters from the String, starting at the index that was found
				} while (userString.length() > 0);	//through the modifications in the if statment above, if the String's length is 
			}										//at least 1 or more, loop to the beginning, prompting for another input for del
		} while (r=='y' || r=='Y');	//while r variable is 'y', repeats from asking for a new string. set to 'n' when user enters blank string
	}
}