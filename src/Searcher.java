import java.util.ArrayList;
	
	
	/**
	 * Contains Code for search Algorithms
	 * 
	 * @author Andrew
	 * @version 0.1
	 * 
	 */

public class Searcher extends Algorithm {

	@Override
	public void execute() {
		
		// TODO Finish Method
		// TODO Auto-generated method stub
		
	}
	
	public static int sequentialSearch(int[] arr, int first, int last, int value) {

		for (int i = first; i < last; i++) {

			if (arr[i] == value) {

				return i;

			}

		}

		return -1;

	}
	
	
	/**
	 * Searches an ArrayList for a target value. Will only find the first. Does not require ArrayList to be sorted.
	 * @param al ArrayList to search
	 * @param value Target for the search
	 * @return Index of the target.
	 */
	
	public static <T extends Comparable<T>> int sequentialSearch(ArrayList<T> al, T value) {

		for (int i = 0; i < al.size(); i++) {

			if (al.get(i).equals(value)) {

				return i;

			}

		}

		return -1;

	}
	
	/**
	 * Searches a subset of an ArrayList for a target value. Will only find the first. Does not require ArrayList to be sorted.
	 * @param al ArrayList to search
	 * @param first First index value to search
	 * @param last Last index value to search
	 * @param value Target for the search
	 * @return Index of the target
	 */
	
	public static <T extends Comparable<T>> int sequentialSearch(ArrayList<T> al, int first,
			int last, T value) {

		for (int i = first; i < last; i++) {

			if (al.get(i).equals(value)) {

				return i;

			}

		}

		return -1;

	}

	

}
