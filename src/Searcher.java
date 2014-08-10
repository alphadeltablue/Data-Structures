import java.util.ArrayList;

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

	public static int sequentialSearch(ArrayList<Integer> ali, int first,
			int last, int value) {

		for (int i = first; i < last; i++) {

			if (ali.get(i) == value) {

				return i;

			}

		}

		return -1;

	}

	

}
