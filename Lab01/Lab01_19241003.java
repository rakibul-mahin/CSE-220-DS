package ASSIGNMENT1;

public class AssignmentOne {

	public static void main(String[] args) {
		
		int[] mainArray = {10, 20, 30, 40, 50, 60};
		
		//TASK1 STARTS
		System.out.println("TASK 1");
		int[] task1Array = copyArray(mainArray);
		task1Array = shiftLeft(task1Array, 3);
		printArray(task1Array);
		//TASK1 ENDS
		
		System.out.println();
		
		//TASK2 STARTS
		System.out.println("TASK 2");
		int[] task2Array = copyArray(mainArray);
		task2Array = rotateLeft(task2Array, 3);
		printArray(task2Array);
		//TASK2 ENDS
		
		System.out.println();
		
		//TASK3 STARTS
		System.out.println("TASK 3");
		int[] task3Array = copyArray(mainArray);
		task3Array = remove(task3Array,5,2);
		printArray(task3Array);
		//TASK3 ENDS
		
		System.out.println();
		
		//TASK4 STARTS
		System.out.println("TASK 4");
		int[] task4Array = {10,2,30,2,50,2,2,0,0};
		task4Array = removeAll(task4Array, 7, 2);
		printArray(task4Array);
		//TASK4 ENDS
		
		System.out.println();
		
		//TASK5 STARTS
		System.out.println("TASK 5");
		int[] task5Array = {10,3,1,2,10};
		boolean task5Result = balanceResult(task5Array);
		System.out.print(task5Result);
		//TASK5 ENDS
		
		System.out.println();
		
		//TASK6 STARTS
		System.out.println("TASK 6");
		int[] task6Array = arraySeries(4);
		printArray(task6Array);
		//TASK6 ENDS
		
		System.out.println();
		
		//TASK7 STARTS
		System.out.println("TASK 7");
		int[] task7Array = {1,1,2,2,1,1,1,1};
		int bunchValue = bunch(task7Array);
		System.out.print(bunchValue);
		//TASK7 ENDS
		
		System.out.println();
		
		//TASK8 STARTS
		System.out.println("TASK 8");
		int[] task8Array = {4,5,6,6,4,3,6,4};
		boolean task8Result = repetition(task8Array);
		System.out.print(task8Result);
		//TASK8 ENDS
		
		System.out.println();
		
		//CIRCULAR ARRAY
		
		//TASK1 STARTS
		System.out.println("TASK 1");
		int[] cirTask1Array = {10,20,0,0,0,10,20,30};
		int startIndex = 5;
		int size = 5;
		boolean palindrome = palindromeCheck(cirTask1Array, size, startIndex);
		System.out.print(palindrome);
		//TASK1 ENDS
		
		System.out.println();
		
		//TASK2 STARTS
		System.out.println("TASK 2");
		int[] cirTask2Array1 = {40,50,0,0,0,10,20,30};
		int[] cirTask2Array2 = {10,20,5,0,0,0,0,0,55,40,15,25};
		int a1Size = 5;
		int a1Start = 5;
		int a2Size = 7;
		int a2Start = 8;
		int[] cirTask2Array = intersection(cirTask2Array1, a1Size, a1Start, cirTask2Array2, a2Size, a2Start);
		printArray(cirTask2Array);
 		//TASK2 ENDS

	}
	
	//This function is to copy one array from another without messing up the main one
	public static int[] copyArray(int[] array) {
		
		int[] newArray = new int[array.length];
		
		for(int i  = 0; i < newArray.length; i++) {
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	//This is to print array
	public static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	//This method is for TASK-1
	public static int[] shiftLeft(int[] array, int k) {
		
		for(int i = 1; i <= k; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				array[j] = array[j+1];
			}
			array[array.length - 1] = 0;
		}
		
		return array;
	}
	
	//This method is for TASK-2
	public static int[] rotateLeft(int[] array, int k) {
		
		for(int i = 1; i <= k; i++) {
			int temp = array[0];
			for(int j = 0; j < array.length - 1; j++) {
				array[j] = array[j+1];
			}
			array[array.length - 1] = temp;
		}
		
		return array;
	}
	
	//This method is for TASK-3
	public static int[] remove(int[] array, int size, int index) {
		
		for(int i = index; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length - 1] = 0;
		
		return array;
	}
	
	//This method is for TASK-4
	public static int[] removeAll(int[] array, int size, int elem) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == elem) {
				for(int j = i; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				
				i -= 1;
				size -= 1;
			}
		}
		
		return array;
	}
	
	//This method is for TASK-5
	public static boolean balanceResult(int[] array) {
		
		/* First I will add all elements inside List
		 * Now I will check whether the sum is odd or even
		 * If the sum is even then we can divide the array in two parts
		 */
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		
		if(sum % 2 == 0) {
			return true;
		}else {
			return false;
		}

	}
	
	//This method is for TASK-6
	public static int[] arraySeries(int n) {
		/* So we will have n times imaginary parts in the list
		 * For each part we will have n-part 0's
		 * We will also have a value which will start from 1 and will last till n
		 */
		int[] array = new int[n*n];
		int arrayBreak = 1;
		int index = 0;
		int zeroSlots = 1;
		
		while(arrayBreak <= n) {
			int value = arrayBreak;
			
			while(zeroSlots <= n - value) {
				array[index] = 0;
				zeroSlots++;
				index++;
			}
			
			while(value >= 1) {
				array[index] = value;
				value--;
				index++;
			}
			
			arrayBreak++;
			zeroSlots = 1;
			value = n;
			
		}

		return array;
	}
	
	//This method is for TASK-7
	public static int bunch(int[] array) {
		int l = array.length;
		int count = 0;
		
		for(int i  = 0; i < l; i++) {
			int occuranceCount = 1;
			
			for(int j = i + 1; j < l; j++) {
				if(array[i] != array[j]) {
					break;
				}
				
				occuranceCount++;
			}
			
			if (occuranceCount > count) {
				count = occuranceCount;
			}
		}
		
		return count;
	}
	
	//This method is for TASK-8
	public static boolean repetition(int[] array) {
		int[] elem = new int[array.length];
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] != elem[j]) {
					elem[j] = array[i];
				}
			}
		}
		
		int[] elemOccurance = new int[array.length];
		
		for(int i = 0; i < elem.length; i++) {
			int result = 0;
			
			for(int j = 0; j < array.length; j++) {
				if(elem[i] == array[j]) {
					result++;
				}
			}
			
			elemOccurance[index] = result;
			index++;
		}
		
		int findResult = 0;
		
		for(int i = 0; i < elemOccurance.length; i++) {
			for(int j = 0; j < elemOccurance.length; j++) {
				if((elemOccurance[i] == elemOccurance[j]) && (elemOccurance[i] >= 2) && (i != j)) {
					findResult++;
					if(findResult == 2) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	//This method is for Circular Array TASK-1
	public static boolean palindromeCheck(int[] array, int size, int start) {
		int[] forward = new int[size];
		int[] backward = new int[size];
		int end = (start + size - 1) % array.length;
		int s = start;
		int e = end;
		boolean isPalindrome = true;
		
		//for forward
		for(int i = 0; i < size; i++) {
			forward[i] = array[s];
			s = (s + 1) % array.length;
		}
		
		//for backward
		for(int i = 0; i < size; i++) {
			backward[i] = array[e];
			e--;
			if(e < 0) {
				e = array.length - 1;
			}
		}
		
		//Palindrome Check
		for(int i = 0; i < forward.length; i++) {
			if(forward[i] != backward[i]) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
	
	//This method is for Circular Array TASK-2
	public static int[] intersection(int[] a1, int a1Size, int a1Start, int[] a2, int a2Size, int a2Start) {
		int length = 0;
		
		if(a1Size > a2Size) {
			length = a1Size;
		}else {
			length = a2Size;
		}
		
		int[] tempArray = new int[length];
		
		int s1 = a1Start;
		int s2 = a2Start;
		int index = 0;
		int newLength = 0;
		
		for(int i = 0; i < a1Size; i++) {
			for(int j = 0; j < a2Size; j++) {
				if(a1[s1] == a2[s2]) {
					tempArray[index] = a1[s1];
					index++;
					newLength++;
					break;
				}
				
				
				s2 = (s2 + 1) % a2.length;
			}
			
			s1 = (s1 + 1) % a1.length;
		}
		
		int[] array = new int[newLength];
		
		for(int i = 0; i < newLength; i++) {
			array[i] = tempArray[i];
		}

		
		return array;
	}

}
