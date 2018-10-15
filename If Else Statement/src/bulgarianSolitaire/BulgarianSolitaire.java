/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

import java.util.ArrayList;
import java.util.Random;

public class BulgarianSolitaire {
	static Random numGen = new Random();
	static ArrayList<Integer> cards = new ArrayList<Integer>();

	public BulgarianSolitaire() {

	}

	public static void main(String[] args) {
		random(10);
		for (int i = 0; i != cards.size(); i++) {
			System.out.println(cards.get(i));
		}
	}

	public static void random(int x) {
		int temp = x;
		int randomed;
		while (temp >= 1) {
			randomed = numGen.nextInt(temp) + 1;
			cards.add(randomed);
			temp -= randomed;
		}
	}

	public static void compute(ArrayList<Integer> x) {
		ArrayList<Integer> temp = x;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int tempNum = 0;
		for (int i = 0; i != temp.size(); i++) {
			if (temp.get(i) != 0) {
				tempNum += 1;
				newArray.add(temp.get(i));

			}
		}
		newArray.add(tempNum);
	}

	public static void print(int x) {
		System.out.println(x);
	}

}
