/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

public class main {
	static BulgarianSolitaire test = new BulgarianSolitaire();

	public static void main(String[] args) {
		Card[] temp = test.deck();
		System.out.println(temp[3].getID());
		System.out.println(temp[0].getNumber());
	}

}
