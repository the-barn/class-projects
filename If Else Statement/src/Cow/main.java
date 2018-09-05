package Cow;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static boolean ageErr = true;
	static boolean weightErr = true;
	static String roller;
	static int age = 0;
	static int weight = 0;

	public static void main(String[] args) {
		System.out.println(coaster(age(), weight()));

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

	public static String coaster(int x, int y) {
		int ageC = x;
		int weightC = y;

		if (ageC <= 10 && weightC < 80) {
			roller = "This person needs to ride the black roller coaster.";
		} else if (ageC <= 10 && weightC >= 80 && weightC <= 200) {
			roller = "This person needs to ride the green roller coaster.";
		} else if (ageC <= 10 && weightC > 200) {
			roller = "This person needs to ride the yellow roller coaster.";
		} else if (ageC > 10 && ageC <= 20 && weightC < 80) {
			roller = "This person needs to ride the silver roller coaster.";
		} else if (ageC > 10 && ageC <= 20 && weightC >= 80 && weightC <= 200) {
			roller = "This person needs to ride the red roller coaster.";
		} else if (ageC > 10 && ageC <= 20 && weightC > 200) {
			roller = "This person needs to ride the purple roller coaster.";
		} else {
			roller = "This person needs to ride the pink roller coaster.";
		}
		return roller;

	}

}