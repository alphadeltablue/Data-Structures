package util;

import java.util.ArrayList;

import algorithm.SelectionSorter;

/**
 * @author andrew
 *
 */
public class Tester {

	/**
	 * @param args arguments
	 */
	public static void main(String[] args) {

		SelectionSorter sorter = new SelectionSorter();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 15; i >= 0; i--) {
			al.add(i);
		}
		sorter.execute(al);

		Util.printArrayList(al);

	}

}
