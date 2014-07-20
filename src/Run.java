import java.io.*;
import java.util.*;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.ArrayList;

/*
 * Fix Null Pointer Exception:
 * 
 * Probably list.size() call
 * 
 * 
 * 
 * 1 2 4 6 7 1 5 1 456 45 21 78 546 456213 786 12 012 54670 1500
 * Exception in thread "main" java.lang.NullPointerException at Run.main(Run.java:51)
 * 
 * 
 * 
 * Fix Null Pointer Exception:
 * 
 * That means 
 * 
 * 
 * Exception in thread "main" java.lang.NullPointerException at Run.main(Run.java:63)
 * 
 */

public class Run {

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> input = getInput(16);

		
		//String inputString = getStringInput();
		
		Util.printArrayList(input);
		Algorithm.selectionSort(input);

		Util.printArrayList(input);

	}
	
	public static ArrayList<Integer> getInput(int num){
		
		Random random = new Random();

		ArrayList<Integer> ali = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {

			ali.add(random.nextInt(num));
			

		}
		
		return ali;
		
	}
	
	public static String getStringInput(){
		
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		s.close();
		
		return str;
		
	}
	
	
	public static ArrayList<Integer> getInput(String str){
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		
		Scanner t = new Scanner(str);

		while (t.hasNextInt()) {

			ali.add(t.nextInt());

		}

		t.close();
		
		return ali;
	}
	
	
	
	
	
	
	
}








/*
 * System.out.print("<Input>" + " "); String str1 = s.nextLine();
 * System.out.print("<Output>" + " "); System.out.println(str1);
 */
