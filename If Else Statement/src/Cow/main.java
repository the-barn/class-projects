package Cow;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static boolean ageErr = true;
	static boolean WeightErr = true;
	static int age = 0;
	static int weight = 0;

	public static void main(String[] args) {
		System.out.println(age());

	}

	public static int age() {
		while (ageErr) {
			if (input.hasNextInt())
				age = input.nextInt();
			else {
				input.next();
				continue;
			}
			ageErr= false;
		}
		return age;
	}

}