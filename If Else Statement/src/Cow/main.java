package Cow;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static boolean ageErr = true;
	static boolean weightErr = true;
	static int age = 0;
	static int weight = 0;

	public static void main(String[] args) {
		System.out.println(age());

	}

	public static int age() {
		while (ageErr) {
			System.out.println("Enter a valid age in number form (ex: 3): ");
			if (input.hasNextInt()) {
				age = input.nextInt();
				if (age <= 0) {
					continue;
				}
			} else {
				input.next();
				continue;
			}
			ageErr = false;
		}
		return age;
	}

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

}