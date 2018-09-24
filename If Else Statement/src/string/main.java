package string;
/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: String
 * Class: Java CIS 016
 */
import java.util.Arrays;
import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String words = input.nextLine();
		String[] temp = words.split(" ",3);
		Arrays.sort(temp);
		for(int i= 0; i<=2;i++)
		System.out.println(temp[i]);
	}
}
