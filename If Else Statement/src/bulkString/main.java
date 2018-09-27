/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: String version 2
 * Class: Java CIS 016
 */
package bulkString;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static String[] temp;
	static boolean order = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorter();
	}

	public static String[] input() {
		print("Please enter 3 cities separated by a space");
		while (true) {
			String words = input.nextLine();
			words.toLowerCase();
			temp = words.split(" ");
			if (temp.length < 3 || temp.length > 3) {
				print("You did not enter 3 cities, try again.");
				continue;
			} else {
				break;
			}

		}

		return temp;
	}

	public static void sorter() {
		String[] cities = input();
		do {
			if (cities[0].compareTo(cities[1]) == 0 || cities[0].compareTo(cities[2]) == 0
					|| cities[1].compareTo(cities[2]) == 0) {
				print("Two of the names are the same, try again");
				cities = input();
			}
			if (cities[0].compareTo(cities[1]) > 0) {
				String temp = cities[0];
				cities[0] = cities[1];
				cities[1] = temp;
			}
			if (cities[1].compareTo(cities[2]) > 0) {
				String temp = cities[1];
				cities[1] = cities[2];
				cities[2] = temp;
			}
			if (cities[1].compareTo(cities[2]) < 0 && cities[0].compareTo(cities[1]) < 0) {
				order = !order;
			}
		} while (order);
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
	}

	public static void print(String x) {
		System.out.println(x);
	}
}
