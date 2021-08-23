
public class TASK1 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		recurSelectionSort(a,0);
		printArray(a,0);
	}
	
	public static void printArray(int[] array, int i) {
		if(i == array.length) {
			return;
		}else {
			System.out.println(array[i]);
			printArray(array,++i);
		}
	}
	
	public static int findMinPos(int[] a, int start) {
		int last = a.length - 1;
		if(start == last) {
			return start;
		}
		
		int minPos = findMinPos(a, start+1);
		
		if(a[start] < a[minPos]) {
			return start;
		}else{
			return minPos;
		}
	}
	
	public static void recurSelectionSort(int[] a, int start) {
		int length = a.length;
		
		if(start == length) {
			return;
		}
		
		int minPos = findMinPos(a, start);
		
		if(minPos != start) {
			int temp = a[minPos];
			a[minPos] = a[start];
			a[start] = temp;
		}
		
		recurSelectionSort(a,start+1);
	}
	
	/*
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			int minPos = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[minPos]) {
					minPos = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minPos];
			a[minPos] = temp;
		}
	}
	*/

}
