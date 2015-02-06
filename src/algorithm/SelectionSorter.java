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
	public static <T extends Comparable<? super T>> T[] selectionSort (T[] arr) {
		
		// Initializes variables used for sorting
		
		int smallIndex; // Index of the smallest number
		int pass; // Current sorting pass
		int j; // Index of smaller loop
		int length = arr.length; // Length of array
		T temp;
		
		// Loop.
		// The first pass finds the smallest, the second pass finds the second
		// smallest, etc.
		// Will not be affected by duplicates
		for (pass = 0; pass < (length - 1); pass++) {
			
			// Sets the index of the smallest to the current pass
			smallIndex = pass;
			
			// Finds the smallest element in the pass
			for (j = pass + 1; j < length; j++) {
				
				if (arr[j].compareTo(arr[smallIndex]) > 0) {
					
					smallIndex = j;
					
				}
				
			}
			// Switches the nth smallest number with the nth number
			temp = arr[pass];
			arr[pass] = arr[smallIndex];
			arr[smallIndex] = temp;
			
		}
		
		// Returns the array
		return arr;
		
	}

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
