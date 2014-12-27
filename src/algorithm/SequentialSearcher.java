package algorithm;

import java.util.ArrayList;

/**
 * @author andrew
 *
 */
public class SequentialSearcher extends Searcher {
	
	
	
	@Override
	
	/**
	 * Concrete implementation of search. Calls sequentialSearch.
	 *
	 * @param al ArrayList to search
	 * @param target target to search for
	 */
	
	public <T extends Comparable<T>> void search(ArrayList<T> al, T target) {
		sequentialSearch(al, target);
		
	}
	
	/**
	 * Searches an ArrayList for a target. Will only find the first. Does
	 * not require ArrayList to be sorted.
	 *
	 * @param al	ArrayList to search
	 * @param target	search target
	 * @return Index of the target.
	 */
	
	public static <T extends Comparable<T>> int sequentialSearch(
			ArrayList<T> al, T target) {
		
		for (int i = 0; i < al.size(); i++) {
			
			if (al.get(
					i).equals(
							target)) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	/**
	 * @param arr	array to search
	 * @param first	first index to search
	 * @param last	last index to search
	 * @param target	search target
	 * @return	i	index of target
	 */
	public static int sequentialSearch(int[] arr, int first, int last, int target) {
		
		for (int i = first; i < last; i++) {
			
			if (arr[i] == target) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}/**
	 * Searches a subset of an ArrayList for a target. Will only find the
	 * first. Does not require ArrayList to be sorted.
	 *
	 * @param al
	 *            ArrayList to search
	 * @param first
	 *            First index to search
	 * @param last
	 *            Last index to search
	 * @param target
	 *            Target for the search
	 * @return Index of the target
	 */
	
	public static <T extends Comparable<T>> int sequentialSearch(
			ArrayList<T> al, int first, int last, T target) {
		
		for (int i = first; i < last; i++) {
			
			if (al.get(
					i).equals(
							target)) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	
	
	
	
}


