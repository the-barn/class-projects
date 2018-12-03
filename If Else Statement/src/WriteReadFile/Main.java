/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: 
 * Class: Java CIS 016
 */
package WriteReadFile;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Random random = new Random();

	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			for (int i = 0; i != 100; i++) {
				int temp = random.nextInt(100);
				output.println(temp);
			}
		}
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			System.out.println(input.next());
		}
	}
}