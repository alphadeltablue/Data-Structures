import java.util.ArrayList;

public class Util {

	public static void printArrayList(ArrayList<?> al){
		
		System.out.print("\n");
		
		System.out.print("{");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i));

			if(i != al.size()-1){
				System.out.print("," + " ");
			}

		}
		;

		System.out.print("}");
		
		System.out.print("\n");
		
	}

	
	public static void printArray(int[] arr) {
		
		System.out.print("\n");
		
		System.out.print("{");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

			if (i != arr.length - 1) {
				System.out.print("," + " ");
			}

		}
		;

		System.out.print("}");
		System.out.print("\n");
	}
	
	
	public static <T,U> void compare(){
		
		// TODO Finish method
		
	}
	
}
