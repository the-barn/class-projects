/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package bulgarianSolitaire;

public class Card {
	private int number;
	private char suit;
	public Card() {
		number= 0;
		suit ='A';
	}
	public Card(int number, char suit) {
		this.number = number;
		this.suit = suit;
	}
	protected void setNumber(int number) {
		this.number = number;
	}
	protected void setSuit(char suit) {
		this.suit = suit;
	}
	protected int getNumber() {
		return number;
	}
	protected char getSuit() {
		return suit;
	}
}
