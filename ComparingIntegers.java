/** Brian Ho, March 7, 2016
*This program will compare two integers and tell you 
*the higher of the two, or let you know they are equal.
*/
import java.util.Scanner; // imports scanner class
public class ComparingIntegers {
	public static void main(String[] args) { // main method
		Scanner userInput = new Scanner (System.in); //creates new scanner object

		int firstNum, secondNum; //used with scanner variable to get and store first and second numbers to be calculated
		
		System.out.println("This program will let you know which number is bigger (in the form of an integer)");
		System.out.println(""); //empty line for formatting
		System.out.println("Enter your first number."); //prompts the user for their first number
		firstNum = (int)userInput.nextDouble(); /*scanner gets and stores first number through user input. 
												*The program expects a double so that the user can input a floating
												*or non-floating number. In the case of a floating number, the number
												*will be casted into an integer. */
		System.out.println("Enter your second number."); //prompts the user for their second number
		secondNum = (int)userInput.nextDouble(); /*scanner gets and stores second number through user input. 
												*The program expects a double so that the user can input a floating
												*or non-floating number. In the case of a floating number, the number
												*will be casted into an integer. */
		if (firstNum > secondNum) { //if the first number is greater than the second, notify the user their first number was bigger
			System.out.println("Your first number, " + firstNum + ", was the greater number.");
		} else if (firstNum == secondNum) {	//if the two numbers are equal, notify the user that their numbers were the same
			System.out.println("Both numbers (" + firstNum + ") were the same.");
		} else {	//otherwise, the only other alternative could be that the second number is bigger, and it notifies that to the user
			System.out.println("Your second number, " + secondNum + ", was the greater number.");
		}
	}
}