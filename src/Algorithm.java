import java.util.ArrayList;


public class Algorithm {
	
	
	public static void selectionSort(int[] arr){
		
		int smallIndex;
		int pass;
		int j;
		int length = arr.length;
		int temp;
		
		for (pass = 0; pass < length-1; pass++){
			
			smallIndex = pass;
			
			for(j = pass+1; j < length; j++){
				
				if(arr[j] < arr[smallIndex]){
					
					smallIndex = j;
					
				}
				
			}
			
			temp = arr[pass];
			arr[pass] = arr[smallIndex];
			arr[smallIndex] = temp;
			
			
		}
				
	}
	
	public static void selectionSort(ArrayList<Integer> ali){
		
		int smallIndex;
		int pass;
		int j;
		int length = ali.size();
		int temp;
		
		for (pass = 0; pass < length-1; pass++){
			
			smallIndex = pass;
			
			for(j = pass+1; j < length; j++){
				
				if(ali.get(j) < ali.get(smallIndex)){
					
					smallIndex = j;
					
				}
				
			}
			
			temp = ali.get(pass);
			ali.set(pass, ali.get(smallIndex));
			ali.set(smallIndex, temp);
						
			
		}
				
	}
	
	public static int sequentialSearch(int[] arr, int first, int last, int value){
		
		for(int i = first; i < last; i++){
			
			if(arr[i] == value){
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static int sequentialSearch(ArrayList<Integer> ali, int first, int last, int value){
		
		for(int i = first; i < last; i++){
					
					if(ali.get(i) == value){
						
						return i;
						
					}
					
				}
				
				return -1;
		
	}
	
	
	
	
	
	
}
