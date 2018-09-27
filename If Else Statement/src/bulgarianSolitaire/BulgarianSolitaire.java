/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

public class BulgarianSolitaire {
	Card[] cArr = new Card[52];
	char[] suit = { 'A', 'B', 'C', 'D' };

	public BulgarianSolitaire() {

	}

	protected void generator() {
		 int slot = 0;
		 for (int x = 1; x!=14;x++) {
			for (int i = 0; i !=4; i++) {
				Card temp = new Card();
				temp.setNumber(x);
				temp.setSuit(suit[i]);
				cArr[slot] = temp;
				slot++;
			}
		 }
		for (int i = 0; i != cArr.length; i++) {
			Card temp = cArr[i];
			System.out.println(Character.toString(temp.getSuit())+ Integer.toString(temp.getNumber()));
		}
	}
}
