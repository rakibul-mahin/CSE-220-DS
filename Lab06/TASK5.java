
public class TASK5 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		Doubly l = new Doubly(a);
		l.showList();
		insertionSort(l.head);
		l.showList();

	}
	
	public static void insertionSort(Node2 head) {
		for(Node2 n = head; n != null; n = n.nextLoc) {
			int temp = n.data;
			Node2 check = n;
			
			while(check.prevLoc != null && check.prevLoc.data > temp) {
				check.data = check.prevLoc.data;
				check = check.prevLoc;
			}
			
			check.data = temp;
		}
	}

}
