package util;

import java.util.ArrayList;

/**
 * Utility methods.
 *
 * @author Andrew
 * @version 0.2
 */

public class Util {
	
	/**
	 * @param	a	Comparable Object a
	 * @param	b	Comparable Object b
	 * @return	a.compareTo(b)
	 */
	public static <T extends Comparable<T>> int compare(T a, T b) {
		
		return a.compareTo(b);
		
	}
	
	/**
	 * Prints out an Array
	 *
	 * @param arr
	 *            Array to be printed
	 */
	
	public static void printArray(int[] arr) {
		
		System.out.print("\n");
		
		System.out.print("{");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]);
			
			if (i != (arr.length - 1)) {
				System.out.print("," + " ");
			}
			
		}
		;
		
		System.out.print("}");
		System.out.print("\n");
	}
	
	/**
	 * Prints out an ArrayList
	 *
	 * @param al
	 *            ArrayList to be printed
	 */
	
	public static void printArrayList(ArrayList<?> al) {
		
		System.out.print("\n");
		
		System.out.print("{");
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.print(al.get(i));
			
			if (i != (al.size() - 1)) {
				System.out.print("," + " ");
			}
			
		}
		;
		
		System.out.print("}");
		
		System.out.print("\n");
		
	}
	
}
