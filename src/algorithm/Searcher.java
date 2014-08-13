package algorithm;

import java.util.ArrayList;

/**
 * Contains Code for search Algorithms
 * 
 * @author Andrew
 * @version 0.1
 * 
 */

public abstract class Searcher extends Algorithm {
	
	// @Override
	/**
	 * Executes operation of the algorithm
	 * @param al ArrayList to search
	 * @param target target to search for
	 */
	
	public <T extends Comparable<T>> void execute(ArrayList<T> al, T target) {
		search(al, target);
	}
	
	/**
	 * Abstract search method
	 * @param al ArrayList to search
	 * @param target target to search for
	 */
	
	public abstract <T extends Comparable<T>> void search(ArrayList<T> al,
			T target);
	
}
