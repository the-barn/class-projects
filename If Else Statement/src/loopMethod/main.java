/**
 * Hector Ramirez
 * Date: 10/10/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package loopMethod;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static long userInput = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long temp = user();
		System.out.println("Sum of the digits in the number " + temp + " is " + sumDigits(temp));

	}

	public static int sumDigits(long n) {
		String[] temp = Long.toString(n).split("");
		int sum = 0;
		for (int i = 0; i != temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}

	public static long user() {
		while (true) {
			System.out.println("Enter a valid positive integer (ex: 123): ");
			if (input.hasNextLong()) {
				userInput = input.nextLong();
				if (userInput <= 0) {
					continue;
				}
			} else {
				input.next();	
				continue;
			}
			break;
		}
		return userInput;
	}

}
