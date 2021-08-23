
public class TASK3 {

	public static void main(String[] args) {
		int[] a = {50,2,420,69,96};
		Singly l = new Singly(a);
		l.display();
		bubbleSort(l.head);
		l.display();

	}
	
	public static void bubbleSort(Node head) {
		for(Node n = head; n != null; n = n.nextLoc) {
			for(Node m = head; m.nextLoc != null; m = m.nextLoc) {
				if(m.data > m.nextLoc.data) {
					int temp = m.data;
					m.data = m.nextLoc.data;
					m.nextLoc.data = temp;
				}
			}
		}
	}
	
	

}
