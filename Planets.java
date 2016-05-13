import java.util.Scanner;			//importing Scanner class for getting user input
import java.text.DecimalFormat;		//importing DecimalFormat class to round numbers to x decimal places

public class Planets {				
	public static void main (String[] args) {		
		Scanner input = new Scanner(System.in);		//new scanner variable
		DecimalFormat decForm = new DecimalFormat("#.#");	//new decimalformat variable, sets to one decimal point
		int planetChoice;	//variable for choice from planet list
		double weight;		//variable for weight input from user
		int repeat = 1;		//variable for master while loop to repeat
		char userRepeat;	//variable for user input if they want to repeat program
		
		while (repeat==1) {		//this while loop encompasses the whole program, repeats the program again if the repeat variable is set via user input.
			System.out.println ("");
			System.out.println ("Calculate your weight on another planet!  ");
			System.out.println ("Select a planet from the list below, followed by your weight,");		
			System.out.println ("and you will find out how much you weigh on that planet.");
			System.out.println ("");
			System.out.println ("         Solar System Planets          ");							//Welcoming message and planet list
			System.out.println ("");
			System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println ("1. Jupiter     4. Neptune     7. Uranus");
			System.out.println ("2. Mars        5. Pluto       8. Venus");
			System.out.println ("3. Mercury     6. Saturn      9. <Quit>");
			System.out.println ("");
			
			do {	//enclosed in this do is the prompt and user input of the planet choice from the user
			System.out.print ("Enter the planet of your choice by its number: ");	//instructional text
			planetChoice = input.nextInt();		//user input prompt, planetChoice variable is set to the integer that user inputs here
			if (planetChoice<1 || planetChoice>9)	//if user enters a choice below 1, or above 9, print instructional text to notify user of proper input format for next time
				System.out.println ("Please enter a number from 1-9 corresponding to the list above.");
				System.out.println ("");	
			} while (planetChoice<1 || planetChoice>9);		//if the user enters a choice below 1, or above 9, it will restart from the
															//do, prompting them again and repeating until they enter a number from 1 to 9
															
			if (planetChoice == 9) {	//if the user inputs 9, which is <quit> in the menu, program ends here (because it doesn't proceed to the else)
				System.out.println ("Goodbye.");			
			} else {				//otherwise, if the input was valid, run the rest of the program
			
				do {	//enclosed in this do is the prompt and user input for their weight
				System.out.print ("Enter your weight on Earth in pounds: ");	//instructional text
				weight = input.nextDouble();	//user input prompt, weight variable is set to the floating number that user inputs here
				if (weight < 0) 	//if user enters a negative number, print instructional text to notify user of proper input format for next time
					System.out.println ("Please enter a number above 0");
					System.out.println ("");
				} while (weight < 0);	//if the user enters a negative number, it will restart from the do,
										//prompting them again and repeating until they enter a positive number
				switch (planetChoice) {		//switch statement relating to user's planetChoice input, performs case # action depending on the input
					case 1:				//if this is the case corresponding to input, print planet text along with their weight multiplied by planet's respective gravity factor
						System.out.println ("Your weight on Jupiter is: " + (decForm.format(weight * 2.64)));
						break;			//break statement needed so that it doesn't continue to process the other cases
					case 2: 
						System.out.println ("Your weight on Mars is: " + (decForm.format(weight * 0.38)));
						break;
					case 3: 
						System.out.println ("Your weight on Mercury is: " + (decForm.format(weight * 0.37)));
						break;
					case 4: 
						System.out.println ("Your weight on Neptune is: " + (decForm.format(weight * 1.12)));
						break;
					case 5: 
						System.out.println ("Your weight on Pluto is: " + (decForm.format(weight * 0.04)));
						break;
					case 6: 
						System.out.println ("Your weight on Saturn is: " + (decForm.format(weight * 1.15)));
						break;
					case 7: 
						System.out.println ("Your weight on Uranus is: " + (decForm.format(weight * 1.15)));
						break;
					case 8: 
						System.out.println ("Your weight on Venus is: " + (decForm.format(weight * 0.88)));
						break;
				}
				System.out.print("Do you want to run the program again? y/n ");		//after the result, prompts user if they want to run the program again
					userRepeat = input.next().charAt(0);		//gets input from user for variable userRepeat. Reads the first letter of user's input, if y or Y, if condition satisfied
					if (userRepeat=='y' || userRepeat=='Y') {
						repeat=1;		//sets repeat variable to one, which is true to the very first while loop to run program again
					} else {
						repeat=0;		//sets repeat variable to zero, which is false to the very first while loop, ending the program
					}
			}	
		}
	}
}