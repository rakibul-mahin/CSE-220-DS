
public class Tester {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60};
		LAB5 t1 = new LAB5();
		System.out.println(t1.factorial(9));
		System.out.println(t1.fibonacci(8));
		t1.printArray(array,0);
		System.out.println(t1.decToBin(4));
		System.out.println(t1.pow(2, 3));
		SinglyLinkedList l1 = new SinglyLinkedList(array);
		System.out.println(t1.addNodeElem(l1.head));
		t1.rev(l1.head);
		
	}

}
