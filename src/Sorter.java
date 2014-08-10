import java.util.ArrayList;


	/**
	 * 
	 * Contains code for sorting algorithms.
	 * 
	 * @author Andrew
	 * @version 0.1
	 * 
	 */

public class Sorter extends Algorithm {

	@Override
	public void execute() {
		// TODO Finish method
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Sorts an integer array.
	 * @param arr Array to be sorted
	 */
	
	public static void selectionSort(int[] arr) {

		int smallIndex;
		int pass;
		int j;
		int length = arr.length;
		int temp;

		for (pass = 0; pass < length - 1; pass++) {

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
	
	/**
	 * Sorts an ArrayList.
	 * @param al ArrayList to be sorted
	 */
	
	public static <T extends Comparable<T>> void selectionSort(ArrayList<T> al){
		
		int smallIndex;
		int pass;
		int j;
		int length = al.size();
		T temp;
		

		for (pass = 0; pass < length - 1; pass++) {

			smallIndex = pass;

			for (j = pass + 1; j < length; j++) {

				if (al.get(j).compareTo(al.get(smallIndex))<0) {

					smallIndex = j;

				}

			}

			temp = al.get(pass);
			al.set(pass, al.get(smallIndex));
			al.set(smallIndex, temp);

		}
		
		
	}

	

}
