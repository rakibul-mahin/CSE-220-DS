
public class TASK4 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		Singly l = new Singly(a);
		l.display();
		selectionSort(l.head);
		l.display();
		

	}
	
	public static void selectionSort(Node head) {
		for(Node n = head; n.nextLoc != null; n = n.nextLoc) {
			Node minNode = n;
			for(Node m = n.nextLoc; m != null; m = m.nextLoc) {
				if(m.data < minNode.data) {
					minNode = m;
				}
			}
			
			int temp = minNode.data;
			minNode.data = n.data;
			n.data = temp;
		}
	}

}
