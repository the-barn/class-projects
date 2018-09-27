/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: Arrays
 * Class: Java CIS 016
 */
package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	static Random ran = new Random();
	static Scanner input = new Scanner(System.in);
	static int listLength = 0;
	static int ranRange = 0;
	static boolean lenErr = true;
	static boolean ranErr = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compile();
	}

	public static void compile() {
		int loLength = getLength();
		int loRange = getRange();
		int[] local = list(loLength, loRange);
		for (int i = 0; i != local.length; i++) {
			print(local[i]);
		}
		System.out.printf("The average of all numbers is: %.2f", sum(local));
		print("            ");
		int[] temp = count(local, loRange);
		for (int i = 0; i != temp.length; i++) {
			if (temp[i] == 1) {
				print("the number " + Integer.toString(i + 1) + " appears " + Integer.toString(temp[i]) + " time");
			} else {
				print("the number " + Integer.toString(i + 1) + " appears " + Integer.toString(temp[i]) + " times");
			}
		}
	}

	public static int[] count(int[] x, int y) {
		int[] localList = x;
		int[] countList = new int[y];
		Arrays.sort(localList);
		for (int j = 1; j != countList.length + 1; j++) {
			for (int i = 0; i != localList.length; i++) {
				if (localList[i] == j) {
					countList[j - 1] += 1;
				}
			}
		}
		return countList;
	}

	public static double sum(int[] x) {
		int[] localList = x;
		double result = 0;
		for (int i = 0; i != localList.length; i++) {
			double temp = localList[i];
			result += temp;
		}
		result /= localList.length;
		return result;
	}

	public static int[] list(int x, int y) {
		final int length = x;
		final int range = y;
		int[] num = new int[length];

		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(range) + 1;
		}

		return num;
	}

	public static int getLength() {
		while (lenErr) {
			print("Enter the number of integers you want to random: ");
			if (input.hasNextInt()) {
				listLength = input.nextInt();
				if (listLength <= 0) {
					continue;
				}
			} else {
				input.next();
				continue;
			}
			lenErr = false;
		}
		return listLength;
	}

	public static int getRange() {
		while (ranErr) {
			print("Enter the range of integers you want to random (starts at 1): ");
			if (input.hasNextInt()) {
				ranRange = input.nextInt();
				if (ranRange <= 0) {
					continue;
				}

			} else {
				input.next();
				continue;
			}
			ranErr = false;
		}

		return ranRange;
	}

	public static void print(int x) {
		System.out.println(x);
	}

	public static void print(String x) {
		System.out.println(x);
	}

	public static void print(double x) {
		System.out.println(x);
	}
}
