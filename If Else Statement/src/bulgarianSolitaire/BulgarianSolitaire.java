/**
 * Hector Ramirez
 * Date: 10/8/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BulgarianSolitaire {
	Card[] cArr = new Card[52];
	char[] suit = { 'A', 'B', 'C', 'D' };

	public BulgarianSolitaire() {

	}

	protected void generator() {
		int slot = 0;
		for (int x = 1; x != 14; x++) {
			for (int i = 0; i != 4; i++) {
				Card temp = new Card();
				temp.setNumber(x);
				temp.setSuit(suit[i]);
				temp.setID(slot);
				cArr[slot] = temp;
				slot++;
			}
		}
	}

	protected Card[] shuffle(Card[] deck) {
		int[] shuffled = new int[52];
		for (int i = 0; i < shuffled.length; i++) {
			shuffled[i] = i;
		}
		Collections.shuffle(Arrays.asList(shuffled));
		Card[] temp = new Card[52];
		for (int i = 0; i < 45; i++) {
			temp[i] = deck[shuffled[i]];
		}
		return temp;
	}

	protected int[] stacker(Card[] x) {
		return null;
	}

	protected Card[] reStack(Card[] x) {

		return null;
	}

	protected int[] randomStack() {

		return null;
	}

}
