/**
 * Hector Ramirez
 * Date: 9/24/2018
 * Assignment: String builder
 * Class: Java CIS 016
 */
package stringBuilderClass;

public class main {
	final static String sentence = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way-- in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only.";
	final static String wKey = "it";
	final static char cKey = ',';
	static StringBuilder output = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replacer(sentence);
	}

	public static void print(StringBuilder x) {
		System.out.println(x);
	}

	public static StringBuilder nameRep(String x) {
		String[] temp = x.toLowerCase().split(" ");
		for (int i = 0; i != temp.length; i++) {
			if (wKey.equals(temp[i])) {
				output.append("Hector" + " ");
			} else {
				output.append(temp[i] + " ");
			}
		}

		return output;
	}

	public static StringBuilder charRep(StringBuilder x) {
		StringBuilder localString = new StringBuilder();
		localString = x;
		for (int i = 0; i != localString.length(); i++) {
			if (localString.charAt(i) == cKey) {
				localString.setCharAt(i, ':');
			}
		}

		return localString;
	}

	public static void replacer(String x) {
		print(charRep(nameRep(x)));
	}
}
