
public class TASK6 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		recurSelectionSort(a,0);
		printArray(a,0);
		System.out.println(binarySearch(a,420,0,a.length-1));
		
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
	
	public static int binarySearch(int[] a, int val, int low, int high) {
		if(high >= low) {
			int mid = (low + high) / 2;
			
			if(a[mid] == val) {
				return mid;
			}else if(a[mid] < val) {
				low = mid + 1;
				return binarySearch(a, val, low, high);
			}else {
				high = mid - 1;
				return binarySearch(a,val,low,high);
			}
		}
		
		return 0;
	}
	
	

}
