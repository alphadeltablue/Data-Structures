import java.io.*;
import java.util.*;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.ArrayList;

/**
 * This class is a test program created to test the algorithms. It generates an
 * ArrayList of numbers, sorts them, and prints them out.
 * 
 * @author Andrew
 * @version 0.3
 * 
 */

public class Run {

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> input = getInput(16);

		// String inputString = getStringInput();

		// TODO Finish changing so that the execute method is called

		Util.printArrayList(input);
		Sorter.selectionSort(input);

		Util.printArrayList(input);

	}

	/**
	 * Generates an ArrayList with random Integers.
	 * 
	 * @param num
	 *            Number of Integers to be returned
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> getInput(int num) {

		Random random = new Random();

		ArrayList<Integer> ali = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {

			ali.add(random.nextInt(num));

		}

		return ali;

	}

	/**
	 * Gets a string input from System.in
	 * 
	 * @return a string from System.in.
	 * 
	 */
	public static String getStringInput() {

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		s.close();

		return str;

	}

	/**
	 * Parses a string into an ArrayList
	 * 
	 * @param str
	 * @return
	 */

	public static ArrayList<Integer> getInput(String str) {

		ArrayList<Integer> ali = new ArrayList<Integer>();

		Scanner t = new Scanner(str);

		while (t.hasNextInt()) {

			ali.add(t.nextInt());

		}

		t.close();

		return ali;
	}

}
