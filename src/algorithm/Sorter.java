package algorithm;

import java.util.ArrayList;

/**
 *
 * Contains code for sorting algorithms.
 *
 * @author Andrew
 * @version 0.1
 *
 */

public abstract class Sorter extends Algorithm {
	// @Override
	/**
	 * @param al	ArrayList
	 */
	public <T extends Comparable<T>> void execute(ArrayList<T> al) {
		sort(al);
	}
	
	/**
	 * @param al	ArrayList
	 */
	public abstract <T extends Comparable<T>> void sort(ArrayList<T> al);
	
}
