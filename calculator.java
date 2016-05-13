/** Brian Ho, March 6, 2016
*This simple calculator can add, subtract, multiply, or divide two numbers.
*/
import java.util.Scanner; // imports scanner class
public class calculator {
	public static void main(String[] args) { // main method
		Scanner userInput = new Scanner (System.in); //creates new scanner object
		/* declaration of various variables */
		String welcomeMessage; //greeting
		String getName; //used with scanner variable to get and store user's name
		String method; //used with scanner variable to get and store arithmetic method
		double firstNum, secondNum; //used with scanner variable to get and store first and second numbers to be calculated
		
		/*welcomeMessage variable assigned to a string value, then printed on next line. 
		*Variable not assigned value at declaration only for this variable,
		*just wanted to test order/positioning.*/
		welcomeMessage = "Welcome to Brian's calculator. What is your name?"; 
		System.out.println(welcomeMessage); //prompts the user for their name
		getName = userInput.next(); //scanner gets and stores name through user input
			
		System.out.println("Enter your first number."); //prompts the user for their first number
		firstNum = userInput.nextDouble(); //scanner gets and stores first number through user input
		
		System.out.println("Enter your second number."); //prompts the user for their second number
		secondNum = userInput.nextDouble(); //scanner gets and stores second number through user input
		
		 /* Asks user what arithmetic method they want to perform, and gets their input stored into method variable */
		System.out.println("Do you want to add (a), subtract (s), multiply (m), or divide (d)? a/s/m/d");
		method = userInput.next();
		
		switch(method) { //switch statement using method variable from above to determine outcome
			case "a": //if a, adds
				System.out.println(getName + ", your sum is " + (firstNum + secondNum));
				break; //break exists so switch statement won't continue to perform subsequent case actions below
			case "s": //if s, subtracts
				System.out.println(getName + ", your difference is " + (firstNum - secondNum));
				break;
			case "m": //if m, multiplies
				System.out.println(getName + ", your product is " + (firstNum * secondNum));
				break;
			case "d": //if d, divides
				System.out.println(getName + ", your quotient is " + (firstNum / secondNum));
				break;
			default: //if input is none of the above, notifies the proper input for next time. Ideally will restart the program after
				System.out.println("Please try again entering a, s, m, or d as inputs.");
		}
	}
}