package algorithm;

import java.util.ArrayList;

/**
 * @author andrew
 *
 */
public class SelectionSorter extends Sorter {

	/**
	 * Sorts an ArrayList.
	 *
	 * @param al	ArrayList to be sorted
	 */

	public static <T extends Comparable<T>> void selectionSort(ArrayList<T> al) {

		int smallIndex;
		int pass;
		int j;
		int length = al.size();
		T temp;

		for (pass = 0; pass < (length - 1); pass++) {

			smallIndex = pass;

			for (j = pass + 1; j < length; j++) {

				if (al.get(j).compareTo(al.get(smallIndex)) < 0) {

					smallIndex = j;

				}

			}

			temp = al.get(pass);
			al.set(pass, al.get(smallIndex));
			al.set(smallIndex, temp);

		}

	}

	/**
	 * Sorts an integer array.
	 *
	 * @param arr
	 *            Array to be sorted
	 */

	public static void selectionSort(int[] arr) {

		int smallIndex;
		int pass;
		int j;
		int length = arr.length;
		int temp;

		for (pass = 0; pass < (length - 1); pass++) {

			smallIndex = pass;

			for (j = pass + 1; j < length; j++) {

				if (arr[j] < arr[smallIndex]) {

					smallIndex = j;

				}

			}

			temp = arr[pass];
			arr[pass] = arr[smallIndex];
			arr[smallIndex] = temp;

		}

	}

	@Override
	public <T extends Comparable<T>> void sort(ArrayList<T> al) {
		selectionSort(al);
	}

}
