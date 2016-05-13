/** Brian Ho, March 7, 2016
*This program will compare three integers and tell you 
*the sum, average, and product of all three numbers, and
*tell you the biggest and smallest number.
*/
import java.util.Scanner; // imports scanner class
import java.lang.Math.*; // imports every subclass from the Math class for use with min and max methods

public class BigComparer {
	public static void main(String[] args) { // main method
		Scanner userInput = new Scanner (System.in); //creates new scanner object
/* 		int i = 0;
while (i<1) { */
		int firstNum, secondNum, thirdNum; //used with scanner variable to get and store first, second and third numbers to be calculated
				
		System.out.println("This program will let you know the sum, average, and product of your numbers, as well as the biggest and smallest numbers(in the form of an integer).");
		System.out.println(""); // empty line for formatting
		
		/*The following scanner gets and stores numbers through user input. The program expects 
		*a double input so that the user can input a floating or non-floating number. 
		*In the case of a floating number, the number will be casted into an integer. */		
		System.out.println("Enter your first number."); //prompts the user for their first number
		firstNum = (int)userInput.nextDouble(); 
		System.out.println("Enter your second number."); //prompts the user for their second number
		secondNum = (int)userInput.nextDouble(); 
		System.out.println("Enter your third number."); //prompts the user for their third number
		thirdNum = (int)userInput.nextDouble(); 
		
		System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum)); //adding the numbers
		System.out.println("The average of the numbers is " + ((firstNum + secondNum + thirdNum) / 3)); //adding the numbers, then dividing by the quantity
		System.out.println("The product of the numbers is " + (firstNum * secondNum * thirdNum)); //multiplies the numbers
		System.out.println("The smallest number is " + Math.min(Math.min(firstNum, secondNum), thirdNum)); /*compares the first number and second number 
		*to see which one is smaller, then compares that number to the third number to see which is smaller */
		System.out.println("The largest number is " + Math.max(Math.max(firstNum, secondNum), thirdNum)); /*compares the first number and second number 
		*to see which one is larger, then compares that number to the third number to see which is larger */
		
/* 		System.out.println("jiweo");
		i = userInput.nextInt(); */
}
	}
}