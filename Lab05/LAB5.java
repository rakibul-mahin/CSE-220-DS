public class LAB5 {

	
	//Task1
	//This Function only works for positive numbers
	public int factorial(int n) {
		if(n == 1) {
			return n;
		}else {
			return n * factorial(n-1);
		}
	}
	
	
	//Task2
	//This Function only works for positive numbers
	public int fibonacci(int n) {
		if(n <= 1) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	//Task3
	//This function prints number in forward
	public void printArray(int[] array, int i) {
		if(i == array.length) {
			return;
		}else {
			System.out.println(array[i]);
			printArray(array,++i);
		}
	}
	
	//Task 4
	public String decToBin(int n) {
		if(n == 0) {
			return "0";
		}else {
			return (n%2)+""+decToBin(n/2);
		}
	}
	
	//Task 5
	public int pow(int base, int power) {
		if(power == 0) {
			return 1;
		}
		
		if(power == 1) {
			return base;
		}
		power--;
		return base * pow(base,power);
	}
	
	//Task 6
	public int addNodeElem(Node h) {
		if(h == null) {
			return 0;
		}else {
			return h.data + addNodeElem(h.nextLoc);
		}
	}
	
	
	//Task 7
	public void rev(Node h) {
		if(h.nextLoc != null) {
			rev(h.nextLoc);
			System.out.println(h.data);
		}else {
			System.out.println(h.data);
		}
	}

}
