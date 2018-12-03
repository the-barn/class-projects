/**
 * Hector Ramirez
 * Date: 11/28/2018
 * Assignment: Threads 
 * Class: Java CIS 016
 */
package threads;

class Fibonnaci extends Thread {
	static int last = 0;
	static int current = 1;
	static int latest = 1;

	public void run() {

		for (int i = 0; i != 20; i++) {
			System.out.println(current);
			last = current;
			current = latest;
			latest = last + current;
		}

	}
}

class Name extends Thread {

	public void run() {

		for (int i = 0; i != 50; i++) {
			System.out.println("Hector");
		}
	}
}

public class main {
	static Fibonnaci fibonnaci = new Fibonnaci();
	static Name name = new Name();

	public static void main(String[] args) {
		fibonnaci.start();
		name.start();
	}

}
