package elseIfStatement;
/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: Else If Statement
 * Class: Java CIS 016
 */

import java.util.Scanner;

public class main {
	// creates the scanner object
	static Scanner input = new Scanner(System.in);
	// creates an error variable for age and weight
	static boolean ageErr = true;
	static boolean weightErr = true;
	// creates a string that will be printed out after being modified by coaster
	// function
	static String roller;
	// creates integers that will be used to store the user's age and weight
	static int age = 0;
	static int weight = 0;

	public static void main(String[] args) {
		// prints out the value of coaster using the age and weight function as
		// parameters.
		System.out.println(coaster(age(), weight()));

	}

	public static int age() {
		// creates a while loop that will run as long as ageErr is true
		while (ageErr) {
			// prints out a message that asks the user to input their age in a valid format.
			System.out.println("Enter a valid age in number form (ex: 3): ");
			// if the value that the user inputs is an integer, it sets the value of age to
			// that int
			if (input.hasNextInt()) {
				age = input.nextInt();
				// if the integer is less than or equal to zero it does the continue command.
				if (age <= 0) {
					// continue tells the code to go back to the beginning of the loop.
					continue;
				}
			} else {
				// if the value is not an integer it goes to the next thing the user puts in
				input.next();
				// same as before
				continue;
			}
			// if the value that was put in by the user is a positive integer. it
			// pseudo-breaks the loop
			ageErr = false;
		}
		// after the loop is completed then we return the value of age which if all
		// things work out correctly returns a positive int
		return age;
	}

	// same as age function
	public static int weight() {
		while (weightErr) {
			System.out.println("Enter a valid weight in number form (ex: 3): ");
			if (input.hasNextInt()) {
				weight = input.nextInt();
				if (weight <= 0) {
					continue;
				}
			} else {
				input.next();
				continue;
			}
			weightErr = false;
		}
		return weight;
	}

	public static String coaster(int x, int y) {
		// requires two integers to work. If they don't have them this code will crash.
		// creates local copies of the variables it's given
		int ageC = x;
		int weightC = y;
		// uses the newly created variable to choose the appropriate response
		if (ageC <= 10 && weightC < 80) {
			roller = "This person needs to ride the black roller coaster.";
		} else if (ageC <= 10 && weightC >= 80 && weightC <= 200) {
			roller = "This person needs to ride the green roller coaster.";
		} else if (ageC <= 10 && weightC > 200) {
			roller = "This person needs to ride the yellow roller coaster.";
		} else if (ageC > 10 && ageC <= 20 && weightC < 80) {
			roller = "This person needs to ride the silver roller coaster.";
			roller = "This person needs to ride the red roller coaster.";
		} else if (ageC > 10 && ageC <= 20 && weightC >= 80 && weightC <= 200) {
		} else if (ageC > 10 && ageC <= 20 && weightC > 200) {
			roller = "This person needs to ride the purple roller coaster.";
		} else {
			roller = "This person needs to ride the pink roller coaster.";
		}
		// once the response has been chosen the value is returned.
		return roller;

	}

}