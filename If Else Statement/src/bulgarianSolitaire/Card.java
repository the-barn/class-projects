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
	private int id;
	public Card() {
		number= 0;
		suit ='A';
		id = 0;
	}
	public Card(int number, char suit, int id) {
		this.number = number;
		this.suit = suit;
		this.id= suit;
	}
	protected void setNumber(int number) {
		this.number = number;
	}
	protected void setSuit(char suit) {
		this.suit = suit;
	}
	protected void setID(int id) {
		this.id= id;
	}
	protected int getNumber() {
		return number;
	}
	protected char getSuit() {
		return suit;
	}
	protected int getID() {
		return id;
	}
	
}
