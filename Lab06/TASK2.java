
public class TASK2 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		printArray(a,0);
		recurInsertionSort(a,1,a.length-1);
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
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void check(int[] array, int i) {
	    if (i == 0) {
	    	return;
	    } 
	    if (array[i] >= array[i - 1]) {
	    	return;
	    } 
	    swap(array, i, i - 1);
	    check(array, i - 1);
	}
	
	public static void recurInsertionSort(int[] a, int minPos, int last) {
		check(a,minPos);
		
		if(minPos + 1 <= last) {
			recurInsertionSort(a,minPos + 1, last);
		}
		
	}
	
	/*
	public static void insertionSort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int minVal = a[i];
			int checkIdx = i-1;
			
			while(checkIdx >= 0 && minVal < a[checkIdx]) {
				a[checkIdx + 1] = a[checkIdx];
				checkIdx--;
			}
			
			a[checkIdx + 1] = minVal;
		}
	}
	*/

}
