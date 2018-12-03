/**
 * Hector Ramirez
 * Date: 10/15/2018
 * Assignment: Bulgarian Solitaire
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

import java.util.ArrayList;
import java.util.Random;

public class BulgarianSolitaire {
	static Random numGen = new Random();
	static ArrayList<Integer> cards = new ArrayList<Integer>();
	static ArrayList<Integer> temp = new ArrayList<Integer>();
	static boolean bulged = true;

	public BulgarianSolitaire() {

	}

	public static void main(String[] args) {
		cards = random(45);
		System.out.println(cards);
		temp = compute(cards);
		System.out.println(temp);
		while (bulged) {
			temp = compute(temp);
			System.out.println(temp);
			bulged = check(temp);
		}
		System.out.println("The Bulgarian has been solitaired");
	}

	public static ArrayList<Integer> random(int x) {
		ArrayList<Integer> finalized = new ArrayList<Integer>();
		int temp = x;
		int randomed;
		while (temp >= 1) {
			randomed = numGen.nextInt(temp) + 1;
			finalized.add(randomed);
			temp -= randomed;
		}
		return finalized;
	}

	public static ArrayList<Integer> compute(ArrayList<Integer> x) {
		ArrayList<Integer> temp = x;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int tempNum = 0;
		for (int i = 0; i != temp.size(); i++) {
			if (temp.get(i) != 0) {
				tempNum += 1;
				if (temp.get(i) - 1 != 0) {
					newArray.add(temp.get(i) - 1);
				}
			} else {

			}
		}
		newArray.add(tempNum);
		return newArray;
	}

	public static boolean check(ArrayList<Integer> x) {
		ArrayList<Integer> temp = x;
		boolean status = false;
		for (int i = 0; i != temp.size(); i++) {
			if (temp.get(i) != i+1) {
				status = true;
			}
		}

		return status;
	}

	public static void print(int x) {
		System.out.println(x);
	}

}
